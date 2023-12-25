package org.bridgelabz;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */
public class Trip {
    private double distance;
    private int duration;
    private TripCategory category;
    public enum TripCategory {
        NORMAL,
        PREMIUM
    }


    public Trip(double distance, int duration, TripCategory category) {
        this.distance = distance;
        this.duration = duration;
        this.category=category;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
    public TripCategory getCategory() {
        return category;
    }
}