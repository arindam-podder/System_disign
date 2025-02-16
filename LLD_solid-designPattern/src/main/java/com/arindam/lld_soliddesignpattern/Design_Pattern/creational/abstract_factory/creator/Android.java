package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.creator;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory.AndroidComponentFactory;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory.UIComponentFactory;

public class Android implements Platform {

    @Override
    public void render() {
        System.out.println("Rendering Android Platform");
    }

    @Override
    public UIComponentFactory getFactory() {
        return new AndroidComponentFactory();
    }
}
