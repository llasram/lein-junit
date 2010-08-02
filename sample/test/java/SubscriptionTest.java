import org.junit.*;
import junit.framework.TestCase;

public class SubscriptionTest extends TestCase {

    @Test
    public void testGetPricePerMonth() {
        Subscription s = new Subscription(200, 2);
        assertTrue(s.getPricePerMonth() == 100.0);
    }

}
