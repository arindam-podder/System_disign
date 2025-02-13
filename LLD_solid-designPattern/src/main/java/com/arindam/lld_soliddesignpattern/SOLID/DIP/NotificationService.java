package com.arindam.lld_soliddesignpattern.SOLID.DIP;

// Violates DIP
/*public class NotificationService {
    private EmailNotification notification = new EmailNotification();

    public void notifyUser() {
        notification.sendNotification();
    }
}
*/

// DIP follows
public class NotificationService {
    private INotification notification;
    public NotificationService(INotification notification) {
        this.notification = notification;
    }
    public void notifyUser() {
        notification.sendNotification();
    }
    
}
