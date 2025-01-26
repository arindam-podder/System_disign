package com.arindam.lld_soliddesignpattern.SOLID.DIP;

public class WhatsupNotification implements INotification {
    @Override
    public void sendNotification() {
        System.out.println("Whatsup Notification");
    }
}
