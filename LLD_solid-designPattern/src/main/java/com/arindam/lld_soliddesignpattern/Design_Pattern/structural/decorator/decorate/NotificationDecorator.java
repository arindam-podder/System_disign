package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.decorate;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.base.Notification;

public abstract class NotificationDecorator implements Notification {
    private Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String msg) {
        notification.send(msg);
    }

}
