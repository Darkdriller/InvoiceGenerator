package org.bridgelabz;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */

public class InvoiceSummary {
    private int totalTrips;
    private double totalFare;
    private double averageFarePerRide;

    public InvoiceSummary(int totalTrips, double totalFare, double averageFarePerRide) {
        this.totalTrips = totalTrips;
        this.totalFare = totalFare;
        this.averageFarePerRide = averageFarePerRide;
    }


    public int getTotalTrips() {
        return totalTrips;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }
}