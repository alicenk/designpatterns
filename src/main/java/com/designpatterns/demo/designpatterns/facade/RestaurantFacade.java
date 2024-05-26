package com.designpatterns.demo.designpatterns.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RestaurantFacade {
    private final Menu menu;
    private final Cook cook;
    private final Payment payment;

    public RestaurantFacade() {
        menu = new Menu();
        cook = new Cook();
        payment = new Payment();
    }

    public void serveFood() {
        menu.showMenu();
        cook.prepareFood();
        payment.payBill();
    }
}
