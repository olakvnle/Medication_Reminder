package com.Medica.factory;


public class EmailReminder implements Reminder {
    @Override
    public void sendReminder() {
        System.out.println("Sending email reminder...");
    }
}