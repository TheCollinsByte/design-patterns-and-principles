package com.thecollinsbyte.principles.SOLID.liskov;

public interface SecureLoan extends LoanPayment {
    void foreCloseLoan();
}
