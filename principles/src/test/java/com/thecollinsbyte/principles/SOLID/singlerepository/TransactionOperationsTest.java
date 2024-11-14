package com.thecollinsbyte.principles.SOLID.singlerepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionOperationsTest {

    Account account;
    TransactionOperations transactionOperations;

    @BeforeEach
    void setUp() {
        account = new Account();
        account.setAccountNumber(1234);
        account.setFirstName("John");
        account.setTotalAmount(BigDecimal.valueOf(5000));

        transactionOperations = new TransactionOperations(account);
    }

    @Test
    void deposit() {
        transactionOperations.deposit(BigDecimal.valueOf(5000), 1234);
        assertEquals(account.getTotalAmount(), new BigDecimal(10000));
    }

    @Test
    void withdraw() {
        transactionOperations.withdraw(BigDecimal.valueOf(2000), 1234);
        assertEquals(account.getTotalAmount(), new BigDecimal(3000));
    }
}