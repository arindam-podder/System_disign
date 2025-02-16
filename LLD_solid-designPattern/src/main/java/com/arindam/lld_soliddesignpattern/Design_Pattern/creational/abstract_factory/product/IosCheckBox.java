package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product;

public class IosCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Painting Ios CheckBox");
    }
}
