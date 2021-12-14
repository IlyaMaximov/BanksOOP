package edu.phystech.account;


import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = AccountType.Values.DEPOSIT)
public class DepositAccount extends InterestAccount {
    private LocalDate upToDate;

    public DepositAccount(long ownerId, long bankId, double balancePercentage, long accumulatedAmount, LocalDate upToDate) {
        super(ownerId, bankId, balancePercentage, accumulatedAmount);
        this.upToDate = upToDate;
        this.type = AccountType.DEPOSIT;
    }

    public DepositAccount() {
        super();
        this.type = AccountType.DEPOSIT;
    }

    public LocalDate getUpToDate() {
        return upToDate;
    }

    public void setUpToDate(LocalDate upToDate) {
        this.upToDate = upToDate;
    }
}
