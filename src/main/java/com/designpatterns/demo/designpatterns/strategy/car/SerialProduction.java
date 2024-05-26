package com.designpatterns.demo.designpatterns.strategy.car;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SerialProduction implements Produce {
    @Override
    public void produce() {
        Car car = new Car();
        car.setBrand("serial car brand");
        car.setKm("20000 km");
        car.setModel("2019");

        log.info("Manufactured Car: {} {} {}", car.getBrand(), car.getKm(), car.getModel());
    }
}
