package com.arindam.lld_soliddesignpattern.Design_Pattern.creational.prototypeAndRegistry;

public interface Vehicle<T> extends Prototype <T>{
    void showDetails();
    T copy();
}
