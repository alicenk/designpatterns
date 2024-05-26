package com.designpatterns.demo.designpatterns.builder;

public abstract class PromotionBuilder {
    protected Promotion promotion;
    public Promotion promotion(){
        return this.promotion;
    }

    abstract void setProductName();
    abstract void setPromotionNo();
    abstract void setProfile();
}
