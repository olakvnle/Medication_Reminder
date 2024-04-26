package com.Medica.factory;



public class AppNotificationReminder implements Reminder {
    @Override
    public void sendReminder() {
        System.out.println("Sending app notification reminder...");
    }
}
