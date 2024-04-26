package com.Medica.factory;


public class SimpleReminderFactory implements ReminderFactory {
    @Override
    public Reminder createReminder(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailReminder();
        } else if (type.equalsIgnoreCase("notification")) {
            return new AppNotificationReminder();
        } else {
            throw new IllegalArgumentException("Unsupported reminder type: " + type);
        }
    }
}