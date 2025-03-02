package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subscriber;

//weather observer
public interface Observer {

    void update(int temperature, int pressure, int humidity);

}
