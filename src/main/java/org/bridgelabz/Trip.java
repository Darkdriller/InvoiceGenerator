package org.bridgelabz;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */
public class Trip {
    private double distance;
    private int duration;

    public Trip(double distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
}