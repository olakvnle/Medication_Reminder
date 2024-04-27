package com.Medica.controller;

import com.Medica.factory.Reminder;
import com.Medica.factory.ReminderFactory;

public class MedicationController {
    private ReminderFactory reminderFactory;

    public MedicationController(ReminderFactory reminderFactory) {
        this.reminderFactory = reminderFactory;
    }

    public void sendReminder(String type) {
        Reminder reminder = reminderFactory.createReminder(type);
        reminder.sendReminder();
    }
}
