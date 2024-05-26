package com.designpatterns.demo.designpatterns.strategy.car;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderProduction implements Produce {
    @Override
    public void produce() {
        Car car = new Car();
        car.setBrand("order car brand");
        car.setKm("19000 km");
        car.setModel("2022");

        log.info("Manufactured Car: {} {} {}", car.getBrand(), car.getKm(), car.getModel());
    }
}
