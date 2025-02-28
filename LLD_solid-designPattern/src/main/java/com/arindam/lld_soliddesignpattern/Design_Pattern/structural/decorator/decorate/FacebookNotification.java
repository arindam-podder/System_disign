package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.decorate;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.base.Notification;

public class FacebookNotification extends NotificationDecorator{

    public FacebookNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending Facebook: " + msg);
    }
}
