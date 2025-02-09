import org.example.CalculateFactorial;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void testCalculateFactorial() {
        assertEquals(1, CalculateFactorial.calculateFactorial(0));
        assertEquals(1, CalculateFactorial.calculateFactorial(1));
        assertEquals(120, CalculateFactorial.calculateFactorial(5));
        assertEquals(40320, CalculateFactorial.calculateFactorial(8));
    }
}
