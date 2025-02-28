package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.decorate;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.base.Notification;

public class SlackNotification extends NotificationDecorator{

    public SlackNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending Slack: " + msg);
    }
}
