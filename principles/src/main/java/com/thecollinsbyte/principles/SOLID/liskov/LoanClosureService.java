package com.thecollinsbyte.principles.SOLID.liskov;

public class LoanClosureService {
    private final SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();
    }
}
