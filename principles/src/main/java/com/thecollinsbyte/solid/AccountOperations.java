package com.thecollinsbyte.solid;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {

    private static final Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }
}