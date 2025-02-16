package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.factory;

import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product.Button;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product.CheckBox;
import com.arindam.lld_soliddesignpattern.Design_Pattern.creational.abstract_factory.product.InputField;


// Abstract Factory
public interface UIComponentFactory {
    Button createButton();
    InputField createInputField();
    CheckBox createCheckBox();
}
