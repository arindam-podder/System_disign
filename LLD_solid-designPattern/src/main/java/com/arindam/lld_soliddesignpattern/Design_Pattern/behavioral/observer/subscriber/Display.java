package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subscriber;

public class Display implements Observer {

    private String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature, int pressure, int humidity) {
        System.out.println(name +" Display : Temperature: " + temperature + " Pressure: " + pressure + " Humidity: " + humidity);
    }
}
