package com.Medica;



import com.Medica.model.User;
import com.Medica.model.Medication;
import com.Medica.controller.MedicationController;
import com.Medica.factory.SimpleReminderFactory;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create user instance
        User user = new User("JohnDoe", "securepassword123");

        // Create a medication controller with a simple reminder factory
        MedicationController medicationController = new MedicationController(new SimpleReminderFactory());

        // Create a medication instance
        Medication medication = new Medication("Amoxicillin", 500, "mg", LocalDateTime.now().plusHours(6));

        // Print user info
        System.out.println("Username: " + user.getUsername());

        // Assume sendReminder method in the controller sends a notification type reminder
        medicationController.sendReminder("notification");

        // Output scheduled medication details
        System.out.println("Medication scheduled: " + medication.getName() + " at " + medication.getTimeToTake().toString());
    }
}

