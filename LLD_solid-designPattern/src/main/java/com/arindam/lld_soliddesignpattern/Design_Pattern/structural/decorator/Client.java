package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator;

import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.base.EmailNotification;
import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.base.Notification;
import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.decorate.FacebookNotification;
import com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.decorate.SlackNotification;

public class Client {
    public static void main(String[] args) {

        Notification notification = new EmailNotification();
        notification = new SlackNotification(new FacebookNotification(notification));
        notification.send("hello");

    }
}
