package edu.phystech.account;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = AccountType.Values.DEBIT)
public class DebitAccount extends InterestAccount {
    public DebitAccount(long ownerId, long bankId, double balancePercentage, long accumulatedAmount) {
        super(ownerId, bankId, balancePercentage, accumulatedAmount);
    }

    public DebitAccount() {
        super();
    }
}
