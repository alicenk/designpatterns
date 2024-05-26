package com.designpatterns.demo.designpatterns.builder;

public class EmployeeConcreteBuilder extends PromotionBuilder{

    public EmployeeConcreteBuilder(){
        promotion = new Promotion();
    }

    @Override
    void setProductName() {
        promotion.setProductName("Employee Product");
    }

    @Override
    void setPromotionNo() {
        promotion.setPromotionNo(270);
    }

    @Override
    void setProfile() {
        promotion.setProfile("Employee Profile");
    }
}
