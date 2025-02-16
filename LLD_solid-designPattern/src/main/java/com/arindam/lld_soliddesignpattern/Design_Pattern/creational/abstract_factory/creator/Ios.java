package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.creator;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory.IosComponentFactory;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory.UIComponentFactory;

public class Ios implements Platform {

    @Override
    public void render() {
        System.out.println("Rendering IOS Platform");
    }

    @Override
    public UIComponentFactory getFactory() {
        return new IosComponentFactory();
    }
}
