package com.designpatterns.demo.designpatterns.strategy.payment;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CreditCardPayment implements PaymentStrategy {
    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String expirationDate;

    @Override
    public void pay(double amount) {
        // Ödeme işlemleri burada gerçekleştirilir.
        log.info(amount + " TL kredi kartı ile ödendi.");
    }
}
