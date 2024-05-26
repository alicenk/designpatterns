package com.designpatterns.demo.designpatterns.factory.mobile;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.NONE)
public class IOSButton extends AbstractButton {
    @Override
    public void render() {
        log.info("iOS stili buton oluşturuldu.");
    }

    @Override
    public void onClick() {
        log.info("iOS butonuna tıklandı.");
    }
}
