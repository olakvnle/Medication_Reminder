package com.Medica.model;

import java.time.LocalDateTime;

public class Medication {
    private String name;
    private double dosage;
    private String unit; // e.g., "mg", "ml"
    private LocalDateTime timeToTake;

    public Medication(String name, double dosage, String unit, LocalDateTime timeToTake) {
        this.name = name;
        this.dosage = dosage;
        this.unit = unit;
        this.timeToTake = timeToTake;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getDosage() { return dosage; }
    public void setDosage(double dosage) { this.dosage = dosage; }
    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }
    public LocalDateTime getTimeToTake() { return timeToTake; }
    public void setTimeToTake(LocalDateTime timeToTake) { this.timeToTake = timeToTake; }
}