package com.designpatterns.demo.designpatterns.builder;

public class SendPromotion {
    public void send(PromotionBuilder builder){
        builder.setProductName();
        builder.setProfile();
        builder.setPromotionNo();
    }
}
