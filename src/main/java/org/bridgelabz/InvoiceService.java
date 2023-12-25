package org.bridgelabz;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */
import java.util.List;

public class InvoiceService {
    private final TripHistory tripHistory;
    private final InvoiceGenerator invoiceGenerator;


    public InvoiceService() {
        this.tripHistory = new TripHistory();
        this.invoiceGenerator =new  InvoiceGenerator();
    }

    public InvoiceSummary getInvoiceForUser(String userId) {
        List<Trip> trips = tripHistory.getTripsForUser(userId);
        return invoiceGenerator.calculateInvoice(trips);
    }
    public void addTrips(String userId,List<Trip> trips){
        tripHistory.addTripsForUser(userId,trips);
    }
}