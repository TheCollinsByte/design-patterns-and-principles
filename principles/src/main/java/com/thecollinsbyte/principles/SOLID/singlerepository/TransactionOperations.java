package com.thecollinsbyte.principles.SOLID.singlerepository;

import java.math.BigDecimal;

public class TransactionOperations {

    private final Account account;

    public TransactionOperations(Account account) {
        this.account = account;
    }

    public void deposit(BigDecimal amount, int accountNumber) {
        if(account.getAccountNumber() == accountNumber ) {
            account.setTotalAmount(account.getTotalAmount().add(amount));
        }
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        if(account.getAccountNumber() == accountNumber ) {
            account.setTotalAmount(account.getTotalAmount().subtract(amount));
        }
    }
}
