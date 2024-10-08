
package com.example.ProjectLaptopStore.Entity.Enum;

public enum PaymentType_Enum {
    CREDIT_CARD("Credit Card"),
    BANK_TRANSFER("Bank Transfer"),
    E_WALLET("E-wallet");

    private final String displayValue;

    PaymentType_Enum(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}

