import org.example.FibonacciDynamic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciDynamicTest {
    @Test
    public void testCalculateFibonacci(){
        FibonacciDynamic fibonacciDynamic = new FibonacciDynamic(10);
        assertEquals(0, fibonacciDynamic.calculateFibonacci(0));
        assertEquals(1, fibonacciDynamic.calculateFibonacci(1));
        assertEquals(8, fibonacciDynamic.calculateFibonacci(6));
        assertEquals(21, fibonacciDynamic.calculateFibonacci(8));
    }

}
