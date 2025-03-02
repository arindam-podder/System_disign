package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subject;

import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private int temperature;
    private int pressure;
    private int humidity;

    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }

    public void setWeatherData(int temperature, int pressure, int humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
}
