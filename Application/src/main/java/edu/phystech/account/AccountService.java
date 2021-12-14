package edu.phystech.account;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public record AccountService(AccountRepository repository) {
    public DepositAccount createDepositAccount(long ownerId, LocalDate upToDate) {
        return repository.save(new DepositAccount(ownerId, 1.0, 0, upToDate));
    }
}
