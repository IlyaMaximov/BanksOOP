package edu.phystech.account;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = AccountType.Values.DEBIT)
public class DebitAccount extends InterestAccount {
    public DebitAccount(long ownerId, double balancePercentage, long accumulatedAmount) {
        super(ownerId, balancePercentage, accumulatedAmount);
    }

    public DebitAccount() {
        super();
    }
}
