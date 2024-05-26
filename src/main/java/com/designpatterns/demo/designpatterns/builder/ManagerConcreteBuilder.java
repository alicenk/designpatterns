package com.designpatterns.demo.designpatterns.builder;

public class ManagerConcreteBuilder extends PromotionBuilder{

    public ManagerConcreteBuilder(){
        promotion = new Promotion();
    }

    @Override
    void setProductName() {
        promotion.setProductName("Manager Product");
    }

    @Override
    void setPromotionNo() {
        promotion.setPromotionNo(100);
    }

    @Override
    void setProfile() {
        promotion.setProfile("Manager Profile");
    }
}
