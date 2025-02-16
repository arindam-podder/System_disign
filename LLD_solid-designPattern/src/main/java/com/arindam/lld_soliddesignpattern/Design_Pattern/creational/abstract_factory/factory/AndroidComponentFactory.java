package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product.*;

public class AndroidComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public InputField createInputField() {
        return new AndroidInputField();
    }

    @Override
    public CheckBox createCheckBox() {
        return new AndroidCheckBox();
    }
}
