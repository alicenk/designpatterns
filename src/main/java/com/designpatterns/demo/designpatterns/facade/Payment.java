package com.designpatterns.demo.designpatterns.facade;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.NONE)
public class Payment {
    public void payBill() {
        log.info("Hesap ödendi.");
    }
}
