package com.Medica.controller;

import com.Medica.factory.Reminder;
import com.Medica.factory.ReminderFactory;
import com.Medica.factory.SimpleReminderFactory;

public class MedicationController {
    private ReminderFactory reminderFactory;

    public MedicationController() {
        this.reminderFactory = new SimpleReminderFactory();
    }

    public MedicationController(SimpleReminderFactory simpleReminderFactory) {
        //TODO Auto-generated constructor stub
    }

    public void sendReminder(String type) {
        Reminder reminder = reminderFactory.createReminder(type);
        reminder.sendReminder();
    }
}
