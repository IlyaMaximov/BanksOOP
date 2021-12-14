package edu.phystech.account;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public record AccountService(AccountRepository repository) {
    public DepositAccount createDepositAccount(long ownerId, long bankId, LocalDate upToDate) {
        return repository.save(new DepositAccount(ownerId, bankId, 1.0, 0, upToDate));
    }
}
