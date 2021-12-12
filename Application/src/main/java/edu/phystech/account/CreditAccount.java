package edu.phystech.account;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = AccountType.Values.CREDIT)
public class CreditAccount extends BaseAccount {
    private double commission;
    private long creditLimit;

    public CreditAccount(long ownerId,
                         double commission,
                         long creditLimit) {
        super(ownerId);
        this.commission = commission;
        this.creditLimit = creditLimit;
    }

    public CreditAccount() {
        super();
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }
}
