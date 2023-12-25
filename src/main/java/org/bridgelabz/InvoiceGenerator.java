package org.bridgelabz;
/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */


import java.util.List;

public class InvoiceGenerator {

    public double calculateFare(double distance, int time) {
        double fare = 0.0;
        // Rs. 10 per kilometer
        fare += 10.0 * distance;

        // Rs. 1 per minute
        fare += 1.0 * time;

        return Math.max(fare,5.0);
    }
    public double calculateTotalFare(List<Trip> trips){
        double totalFare = 0.0;

        for (Trip trip : trips) {
            double rideFare = calculateFare(trip.getDistance(), trip.getDuration());
            totalFare += rideFare;
        }

        return totalFare;
    }
}