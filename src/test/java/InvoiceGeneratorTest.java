import org.bridgelabz.InvoiceService;
import org.bridgelabz.InvoiceSummary;
import org.bridgelabz.InvoiceGenerator;
import org.bridgelabz.Trip;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */
public class InvoiceGeneratorTest {
    private InvoiceService invoiceService;

    @Before    // Create a single instance of org.bridgelabz.InvoiceGenerator to be reused in each test
    public void setUp() {
        invoiceService = new InvoiceService();
    }
    @Test
    public void calculateInvoice_ShouldReturnCorrectValues_WhenRidesProvided() {
        List<Trip> trips = Arrays.asList(
                new Trip(5.0, 50),  // Rs. 100
                new Trip(7.0, 5)    // Rs. 75
        );


        invoiceService.addTrips("User123",trips);
        InvoiceSummary invoiceSummary =invoiceService.getInvoiceForUser("User123");

        assertEquals(2, invoiceSummary.getTotalTrips());
        assertEquals(175.0, invoiceSummary.getTotalFare(), 0.0);
        assertEquals(87.5, invoiceSummary.getAverageFarePerRide(), 0.0);
    }




}
