package com.designpatterns.demo.designpatterns.strategy.car;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpecialProduction implements Produce {
    @Override
    public void produce() {
        Car car = new Car();
        car.setBrand("special car brand");
        car.setKm("25000 km");
        car.setModel("2016");

        log.info("Manufactured Car: {} {} {}", car.getBrand(), car.getKm(), car.getModel());
    }
}
