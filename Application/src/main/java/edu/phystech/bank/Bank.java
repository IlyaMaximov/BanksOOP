package edu.phystech.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banks")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double debitPercentage;
    private double creditCommission;
    private long unverifiedAmountLimit;

    public Bank() {
    }

    public Bank(double debitPercentage, double creditCommission, long unverifiedAmountLimit) {
        this.debitPercentage = debitPercentage;
        this.creditCommission = creditCommission;
        this.unverifiedAmountLimit = unverifiedAmountLimit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDebitPercentage() {
        return debitPercentage;
    }

    public void setDebitPercentage(double debitPercentage) {
        this.debitPercentage = debitPercentage;
    }

    public double getCreditCommission() {
        return creditCommission;
    }

    public void setCreditCommission(double creditCommission) {
        this.creditCommission = creditCommission;
    }

    public long getUnverifiedAmountLimit() {
        return unverifiedAmountLimit;
    }

    public void setUnverifiedAmountLimit(long unverifiedAmountLimit) {
        this.unverifiedAmountLimit = unverifiedAmountLimit;
    }
}
