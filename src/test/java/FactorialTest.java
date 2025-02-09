import org.example.CalculateFactorial;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest {
    @Test
   public void testCalculateFactorial() {
        assertEquals(1, CalculateFactorial.calculateFactorial(0));
        assertEquals(1, CalculateFactorial.calculateFactorial(1));
        assertEquals(6, CalculateFactorial.calculateFactorial(3));
        assertEquals(5040, CalculateFactorial.calculateFactorial(7));
    }
}
