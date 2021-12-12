package edu.phystech.account;

public enum AccountType {
    CREDIT(Values.CREDIT),
    DEBIT(Values.DEBIT),
    DEPOSIT(Values.DEPOSIT);

    AccountType(String val) {
        if (!this.name().equals(val))
            throw new IllegalArgumentException("Incorrect use of AccountType");
    }

    public static class Values {
        public static final String CREDIT = "CREDIT";
        public static final String DEBIT = "DEBIT";
        public static final String DEPOSIT = "DEPOSIT";
    }
}
