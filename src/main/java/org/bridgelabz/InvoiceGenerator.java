package org.bridgelabz;
/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */


import java.util.List;

public class InvoiceGenerator {

    public double calculateFare(Trip trip) {
        switch (trip.getCategory()) {
            case NORMAL:
                double fare = 10 * trip.getDistance() + 1 * trip.getDuration();
                return Math.max(fare, 5);
            case PREMIUM:
                fare = 15 * trip.getDistance()+ 2 * trip.getDuration();
                return Math.max(fare, 20);
            default:
                throw new IllegalArgumentException("Invalid ride category");
        }
    }
    public double calculateTotalFare(List<Trip> trips){
        double totalFare = 0.0;

        for (Trip trip : trips) {
            double rideFare = calculateFare(trip);
            totalFare += rideFare;
        }

        return totalFare;
    }

    public InvoiceSummary calculateInvoice(List<Trip> trips){
        double totalFare = calculateTotalFare(trips);
        int totalTrips = trips.size();
        double averageFarePerRide = (totalTrips > 0) ? totalFare / totalTrips : 0.0;
        return new InvoiceSummary(totalTrips, totalFare, averageFarePerRide);
    }
}