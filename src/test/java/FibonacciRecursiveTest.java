import org.example.FibonacciDynamic;
import org.example.FibonacciRecursive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciRecursiveTest {
    @Test
    public void testCalculateFibonacci(){
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        assertEquals(0, fibonacciRecursive.calculateFibonacci(0));
        assertEquals(1, fibonacciRecursive.calculateFibonacci(1));
        assertEquals(8, fibonacciRecursive.calculateFibonacci(6));
        assertEquals(21, fibonacciRecursive.calculateFibonacci(8));
    }
}
