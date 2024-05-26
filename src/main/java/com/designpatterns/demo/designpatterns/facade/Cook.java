package com.designpatterns.demo.designpatterns.facade;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.NONE)
public class Cook {
    public void prepareFood() {
        log.info("Yemek hazırlanıyor.");
    }
}
