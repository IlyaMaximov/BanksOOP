package edu.phystech.transaction;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "transactions")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(value = {"id"}, allowGetters = true)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long creatorClientId;

    private long sourceAccountId;
    private long targetAccountId;
    private long amount;

    private TransactionStatus status;
    private Currency currency;
    private LocalDateTime completionTimestamp;
    private String message;

    public Transaction() {
    }

    public Transaction(long creatorClientId,
                       long sourceAccountId,
                       long targetAccountId,
                       long amount,
                       Currency currency) {
        this.creatorClientId = creatorClientId;
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.amount = amount;
        this.currency = currency;
        this.status = TransactionStatus.NEW;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatorClientId() {
        return creatorClientId;
    }

    public void setCreatorClientId(Long creatorClientId) {
        this.creatorClientId = creatorClientId;
    }

    public Long getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(Long sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public Long getTargetAccountId() {
        return targetAccountId;
    }

    public void setTargetAccountId(Long targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDateTime getCompletionTimestamp() {
        return completionTimestamp;
    }

    public void setCompletionTimestamp(LocalDateTime completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Transaction) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.creatorClientId, that.creatorClientId) &&
                Objects.equals(this.sourceAccountId, that.sourceAccountId) &&
                Objects.equals(this.targetAccountId, that.targetAccountId) &&
                Objects.equals(this.amount, that.amount) &&
                Objects.equals(this.currency, that.currency) &&
                Objects.equals(this.completionTimestamp, that.completionTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creatorClientId, sourceAccountId, targetAccountId, amount, currency, completionTimestamp);
    }

    @Override
    public String toString() {
        return "Transaction[" +
                "id=" + id + ", " +
                "creatorClientId=" + creatorClientId + ", " +
                "sourceAccountId=" + sourceAccountId + ", " +
                "targetAccountId=" + targetAccountId + ", " +
                "amount=" + amount + ", " +
                "currency=" + currency + ", " +
                "completionTimestamp=" + completionTimestamp + ']';
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
