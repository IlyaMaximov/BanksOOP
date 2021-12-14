package edu.phystech.bank;

import java.util.List;

import edu.phystech.account.AccountRepository;
import edu.phystech.account.BaseAccount;
import edu.phystech.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    private BankRepository repository;

    @Autowired
    private AccountRepository accountRepository;

    public Bank createBank(Bank bank) {
        return repository.save(bank);
    }

    public List<BaseAccount> getBankAccounts(long bankId) {
        return accountRepository.findAllByBankId(bankId);
    }

    public Bank getBank(long bankId) {
        return repository.findById(bankId).orElseThrow(() -> new ObjectNotFoundException(bankId));
    }
}
