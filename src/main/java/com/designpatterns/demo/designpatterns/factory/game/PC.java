package com.designpatterns.demo.designpatterns.factory.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PC implements Game{
    @Override
    public void platform() {
        log.info("This game runs on PC platform.");
    }
}
