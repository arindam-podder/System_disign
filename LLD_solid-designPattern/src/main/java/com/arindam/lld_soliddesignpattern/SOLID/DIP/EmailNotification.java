package com.arindam.lld_soliddesignpattern.SOLID.DIP;

public class EmailNotification implements INotification {
    @Override
    public void sendNotification() {
        System.out.println("Email Notification");
    }
}
