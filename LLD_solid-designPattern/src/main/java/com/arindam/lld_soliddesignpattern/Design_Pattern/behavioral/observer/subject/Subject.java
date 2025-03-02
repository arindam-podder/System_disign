package com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subject;

import com.arindam.lld_soliddesignpattern.Design_Pattern.behavioral.observer.subscriber.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
