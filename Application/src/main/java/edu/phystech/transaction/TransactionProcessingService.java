package edu.phystech.transaction;

import java.util.concurrent.*;

import javax.annotation.PostConstruct;

import edu.phystech.account.AccountService;
import edu.phystech.account.AccountType;
import edu.phystech.account.BaseAccount;
import edu.phystech.account.CreditAccount;
import edu.phystech.bank.Bank;
import edu.phystech.bank.BankService;
import edu.phystech.client.Client;
import edu.phystech.client.ClientService;
import edu.phystech.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TransactionProcessingService {
    private ScheduledExecutorService tpe;
    private final TransactionRepository transactionRepository;
    private final AccountService accountService;
    private final BankService bankService;
    private final ClientService clientService;

    private int poolSize = 1;

    public TransactionProcessingService(TransactionRepository transactionRepository,
                                        AccountService accountService,
                                        BankService bankService,
                                        ClientService clientService) {
        this.transactionRepository = transactionRepository;
        this.accountService = accountService;
        this.bankService = bankService;
        this.clientService = clientService;
    }

    @PostConstruct
    public void afterPropertiesSet() {
        tpe = Executors.newScheduledThreadPool(poolSize);
        tpe.scheduleAtFixedRate(this::processTransactions, 0, 30, TimeUnit.SECONDS);
    }

    private void processTransactions() {
        transactionRepository.findAllByStatus(TransactionStatus.NEW).forEach(this::processNewTransaction);
        transactionRepository.findAllByStatus(TransactionStatus.TO_CANCEL).forEach(this::cancelTransaction);
    }

    private void processNewTransaction(Transaction transaction) {
        BaseAccount sourceAccount = null;
        BaseAccount targetAccount = null;
        if (transaction.getSourceAccountId() != 0) {
            sourceAccount = accountService.getAccount(transaction.getSourceAccountId());
        }
        if (transaction.getTargetAccountId() != 0) {
            targetAccount = accountService.getAccount(transaction.getTargetAccountId());
        }

        if (sourceAccount != null) {
            Bank bank = bankService.getBank(sourceAccount.getBankId());
            Client client = clientService.getClient(sourceAccount.getOwnerId());

            if (!client.isVerified() && transaction.getAmount() > bank.getUnverifiedTransactionAmountLimit()) {
                updateTransaction(transaction,
                        TransactionStatus.FAILED,
                        String.format("Cannot transfer %d %s because client is not verified",
                                transaction.getAmount(),
                                transaction.getCurrency().name()
                        )
                );
                return;
            }

            if (sourceAccount.getCurrentAmount() < transaction.getAmount()) {
                if (sourceAccount instanceof CreditAccount &&
                        sourceAccount.getCurrentAmount() - transaction.getAmount() >
                                ((CreditAccount) sourceAccount).getCreditLimit()) {
                    sourceAccount.setCurrentAmount(sourceAccount.getCurrentAmount() - transaction.getAmount());
                } else {
                    updateTransaction(transaction, TransactionStatus.FAILED, "Not enough money");
                    return;
                }
            }
            sourceAccount.setCurrentAmount(sourceAccount.getCurrentAmount() - transaction.getAmount());
        }

        if (targetAccount != null) {
            targetAccount.setCurrentAmount(targetAccount.getCurrentAmount() + transaction.getAmount());
        }

        // transactionally
        accountService.updateAccount(sourceAccount);
        accountService.updateAccount(targetAccount);
    }

    private void updateTransaction(Transaction transaction, TransactionStatus status, String message) {
        transaction.setStatus(status);
        transaction.setMessage(message);
        transactionRepository.save(transaction);
    }

    private void cancelTransaction(Transaction transaction) {
        BaseAccount sourceAccount = accountService.getAccount(transaction.getSourceAccountId());
        BaseAccount targetAccount = accountService.getAccount(transaction.getTargetAccountId());

        sourceAccount.setCurrentAmount(sourceAccount.getCurrentAmount() + transaction.getAmount());
        targetAccount.setCurrentAmount(targetAccount.getCurrentAmount() - transaction.getAmount());

        // transactionally
        accountService.updateAccount(sourceAccount);
        accountService.updateAccount(targetAccount);
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }
}
