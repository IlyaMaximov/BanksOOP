package edu.phystech.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    private BankRepository repository;

    public Bank createBank(Bank bank) {
        return repository.save(bank);
    }
}
