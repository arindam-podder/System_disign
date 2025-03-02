package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer;

import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subject.Subject;
import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subject.WeatherStation;
import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subscriber.Display;
import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subscriber.Observer;

public class Client {

    public static void main(String[] args) {
        WeatherStation subject = new WeatherStation();

        Observer observer1 = new Display("TV");
        Observer observer2 = new Display("Mobile");
        Observer observer3 = new Display("Laptop");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        //Weather Data Changes
        subject.setWeatherData(30, 1000, 40);
        System.out.println("=====================================");
        subject.setWeatherData(32, 1002, 45);
        System.out.println("=====================================");

        //unsubscribe One Display
        System.out.println("Unsubscribe Mobile Display");
        subject.removeObserver(observer2);
        subject.setWeatherData(35, 1004, 50);
    }
}
