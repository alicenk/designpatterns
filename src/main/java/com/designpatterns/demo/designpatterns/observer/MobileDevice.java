package com.designpatterns.demo.designpatterns.observer;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class MobileDevice implements Observer{
    public final static String deviceName = "Mobil";
    @Override
    public void update(int temperature) {
        log.info("Mobil cihaz: Sıcaklık " + temperature + " dereceye yükseldi.");
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }
}
