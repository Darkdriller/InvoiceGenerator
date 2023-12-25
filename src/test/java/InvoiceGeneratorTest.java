import org.bridgelabz.InvoiceGenerator;
import org.bridgelabz.Trip;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */
public class InvoiceGeneratorTest {
    private InvoiceGenerator invoiceGenerator;

    @Before    // Create a single instance of org.bridgelabz.InvoiceGenerator to be reused in each test
    public void setUp() {
        invoiceGenerator = new InvoiceGenerator();
    }
    @Test
    public void calculateTotalFare_ShouldReturnCorrectFare_WhenMultipleRides() {

        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip(7.0, 10));  // Trip 1: 7 kilometers, 10 minutes
        trips.add(new Trip(2.0, 8));   // Trip 2: 2 kilometers, 8 minutes


        double totalFare = invoiceGenerator.calculateTotalFare(trips);


        assertEquals( 108.0 ,totalFare, 0.0);
    }



}
