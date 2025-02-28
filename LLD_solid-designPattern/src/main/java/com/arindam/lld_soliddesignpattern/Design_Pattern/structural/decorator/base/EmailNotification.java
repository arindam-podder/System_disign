package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.decorator.base;

public class EmailNotification implements Notification{

//    private String message;
//
//    public EmailNotification(String message) {
//        this.message = message;
//    }

    @Override
    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}
