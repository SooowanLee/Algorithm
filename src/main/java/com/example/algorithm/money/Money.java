package com.example.algorithm;

import java.util.Currency;

public class Money {
    private int amount;
    private Currency currency;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    private void validate(int amount, Currency currency) {
        
    }

    public class Test {
        //잘못된 값 전달
        Money money = new Money(-100, null);
    }
}

