package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product;

public class AndroidInputField implements InputField{
    @Override
    public void paint() {
        System.out.println("Painting Android Input Field");
    }
}
