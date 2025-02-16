package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product.*;

public class IosComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public InputField createInputField() {
        return new IosInputField();
    }

    @Override
    public CheckBox createCheckBox() {
        return new IosCheckBox();
    }
}
