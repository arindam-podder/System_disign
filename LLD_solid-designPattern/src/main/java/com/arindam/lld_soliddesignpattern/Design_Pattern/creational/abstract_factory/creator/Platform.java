package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.creator;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory.UIComponentFactory;

public interface Platform {
    void render();

    // Factory Method
    UIComponentFactory getFactory();
}
