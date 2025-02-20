package com.thecollinsbyte.principles.SOLID.liskov;

public class HomeLoan implements SecureLoan {
    private int balance;

    public HomeLoan(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void foreCloseLoan() {
        if(balance == 0) {
            System.out.println("You can't loan a negative balance");
        } else if (balance > 0) {
            System.out.println("Cannot foreclose HomeLoan with outstanding balance of: " + balance);
        } else {
            System.out.println("Balance error: the loan balance is negative, which is unexpected.");
        }
    }

    @Override
    public void doPayment(int amount) {
        if(amount <= 0) {
            System.out.println("Invalid payment amount. Amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("You can't loan a greater than balance.");
            amount = balance;
        }

        balance = balance - amount;
        System.out.println("Payment of " + amount + " made to Home Loan. Remaining balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
