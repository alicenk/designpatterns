package com.designpatterns.demo.designpatterns.observer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class ComputerDevice implements Observer{
    public static final String deviceName = "Bilgisayar";
    @Override
    public void update(int temperature) {
        log.info("Bilgisayar: Sıcaklık " + temperature + " dereceye yükseldi.");
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }

}
