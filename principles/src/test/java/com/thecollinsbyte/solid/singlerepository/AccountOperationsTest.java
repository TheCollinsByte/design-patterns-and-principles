package com.thecollinsbyte.solid.singlerepository;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountOperationsTest {

    @Test
    void addAccount() {
        Account account = new Account();
        AccountOperations accountOperations = new AccountOperations();

        account.setAccountNumber(4321);
        account.setFirstName("John");
        account.setTotalAmount(BigDecimal.valueOf(5000));

        assertNotNull(account, "The account should not be null.");
        accountOperations.addAccount(account);
        assertEquals(account.getAccountNumber(), 4321);
    }

    @Test
    void updateAccount() {
        Account account = new Account();
        AccountOperations accountOperations = new AccountOperations();

        account.setAccountNumber(1234);
        account.setFirstName("Hassan");
        account.setTotalAmount(BigDecimal.valueOf(5000));

        assertNotNull(account, "The account should not be null.");
        accountOperations.updateAccount(account);
        assertEquals(account.getFirstName(), "Hassan");
    }

    @Test
    void getAccount() {
        Account account = new Account();
        AccountOperations accountOperations = new AccountOperations();

        account.setAccountNumber(1234);
        account.setFirstName("Hassan");
        account.setTotalAmount(BigDecimal.valueOf(5000));

        accountOperations.addAccount(account);

        Account hassanAccount = accountOperations.getAccount(account.getAccountNumber());
        assertNotNull(hassanAccount, "The account should not be null.");
        assertEquals(account.getAccountNumber(), hassanAccount.getAccountNumber());
        assertEquals(account.getFirstName(), hassanAccount.getFirstName());
        assertEquals(account.getTotalAmount(), hassanAccount.getTotalAmount());
    }

}