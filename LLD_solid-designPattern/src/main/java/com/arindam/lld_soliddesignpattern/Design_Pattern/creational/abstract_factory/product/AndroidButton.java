package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product;

public class AndroidButton implements Button {

    @Override
    public void paint() {
        System.out.println("Painting Android Button");
    }
}
