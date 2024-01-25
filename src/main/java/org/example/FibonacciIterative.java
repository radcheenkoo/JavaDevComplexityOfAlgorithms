package org.example;

public class FibonacciIterative {
    public int calculateFibonacci(int n){
        if (n <= 1){
            return n;
        }
        int prevValue = 0;
        int currentValue = 1;

        for (int i = 2; i <= n; i++){
            int temp = currentValue;
            currentValue = prevValue + currentValue;
            prevValue = temp;
        }

        return currentValue;
    }
}
