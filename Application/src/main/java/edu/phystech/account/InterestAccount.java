package edu.phystech.account;

public abstract class InterestAccount extends BaseAccount {
    private double balancePercentage;
    private long accumulatedAmount;

    public InterestAccount(
            long ownerId,
            double balancePercentage,
            long accumulatedAmount
    ) {
        super(ownerId);
        this.balancePercentage = balancePercentage;
        this.accumulatedAmount = accumulatedAmount;
    }

    public InterestAccount() {
        super();
    }

    public double getBalancePercentage() {
        return balancePercentage;
    }

    public void setBalancePercentage(double balancePercentage) {
        this.balancePercentage = balancePercentage;
    }

    public Long getAccumulatedAmount() {
        return accumulatedAmount;
    }

    public void setAccumulatedAmount(Long accumulatedAmount) {
        this.accumulatedAmount = accumulatedAmount;
    }
}
