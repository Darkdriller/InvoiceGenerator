import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */
public class InvoiceGeneratorTest {
    private InvoiceGenerator invoiceGenerator;

    @Before    // Create a single instance of InvoiceGenerator to be reused in each test
    public void setUp() {
        invoiceGenerator = new InvoiceGenerator();
    }
    @Test
    public void calculateTotalFare_ShouldReturnCorrectFare_WhenSingleRide() {

        double totalFare = invoiceGenerator.calculateFare(1,0);
        assertEquals(10.0, totalFare,0.0);

    }



}
