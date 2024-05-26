package com.designpatterns.demo.designpatterns.strategy.payment;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class BankTransferPayment implements PaymentStrategy {
    private final String iban;
    private final String bankName;

    public void pay(double amount) {
        // Ödeme işlemleri burada gerçekleştirilir.
        log.info(amount + " TL banka transferi ile ödendi.");
    }
}
