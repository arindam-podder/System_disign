package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product;

public class IosButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting Ios Button");
    }
}
