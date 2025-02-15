package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.factory_method.product;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by Ship");
    }

}