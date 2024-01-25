import org.example.FibonacciIterative;
import org.example.FibonacciRecursive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciIterativeTest {

    @Test
    public void testCalculateFibonacci(){
        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        assertEquals(0, fibonacciIterative.calculateFibonacci(0));
        assertEquals(1, fibonacciIterative.calculateFibonacci(1));
        assertEquals(8, fibonacciIterative.calculateFibonacci(6));
        assertEquals(21, fibonacciIterative.calculateFibonacci(8));
    }

}
