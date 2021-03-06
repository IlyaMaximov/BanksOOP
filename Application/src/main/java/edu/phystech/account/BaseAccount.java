package edu.phystech.account;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "account_type", columnDefinition = "account_type", discriminatorType = DiscriminatorType.STRING)
@JsonIgnoreProperties(value = {"owner_id", "current_amount", "credit_limit", "commission"}, allowGetters = true)
public abstract class BaseAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long bankId;

    private long ownerId;

    private long currentAmount;

    @Transient
    protected AccountType type;

    public BaseAccount() {
    }

    public BaseAccount(long ownerId, long bankId) {
        this.ownerId = ownerId;
        this.bankId = bankId;
        currentAmount = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Long currentBalance) {
        this.currentAmount = currentBalance;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
