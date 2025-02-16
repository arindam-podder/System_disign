package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product;

public class AndroidCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Painting Android CheckBox");
    }
}
