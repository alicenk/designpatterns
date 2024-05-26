package com.designpatterns.demo.designpatterns.factory.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PS implements Game{
    @Override
    public void platform() {
        log.info("This game runs on PS platform.");
    }
}
