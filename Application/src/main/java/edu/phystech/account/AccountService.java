package edu.phystech.account;

import java.time.LocalDate;

import edu.phystech.client.Client;
import edu.phystech.client.ClientService;
import edu.phystech.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
public record AccountService(
        AccountRepository accountRepository,
        ClientService clientService
) {

    public DepositAccount createDepositAccount(long clientId, LocalDate upToDate) {
        Client client = clientService.getClient(clientId);
        return accountRepository.save(new DepositAccount(clientId, client.getBankId(), 1.0, 0, upToDate));
    }

    public CreditAccount createCreditAccount(long clientId) {
        Client client = clientService.getClient(clientId);
        return accountRepository.save(new CreditAccount(clientId, client.getBankId(), 3, -500));
    }

    public DebitAccount createDebitAccount(long clientId) {
        Client client = clientService.getClient(clientId);
        return accountRepository.save(new DebitAccount(clientId, client.getBankId(), 3, 0));
    }

    public BaseAccount getAccount(long accountId) {
        return accountRepository.findById(accountId).orElseThrow(() -> new ObjectNotFoundException(accountId));
    }

    public void updateAccount(BaseAccount account) {
        accountRepository.save(account);
    }
}
