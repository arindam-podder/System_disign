package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product;

public class IosInputField implements InputField{
    @Override
    public void paint() {
        System.out.println("Painting Ios Input Field");
    }
}
