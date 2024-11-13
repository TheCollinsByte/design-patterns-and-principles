package com.thecollinsbyte.solid;

import com.thecollinsbyte.solid.singlerepository.Account;
import com.thecollinsbyte.solid.singlerepository.AccountOperations;

import java.math.BigDecimal;

public class TransactionOperations {

    public void deposit(BigDecimal amount, int accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }
}
