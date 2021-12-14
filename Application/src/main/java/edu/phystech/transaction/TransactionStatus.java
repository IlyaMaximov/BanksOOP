package edu.phystech.transaction;

public enum TransactionStatus {
    NEW,
    PROCESSED,
    TO_CANCEL,
    CANCELLED,
    FAILED
}
