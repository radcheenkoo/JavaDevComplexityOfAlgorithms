package org.example;

public class FibonacciRecursive {
    public int calculateFibonacci(int n){
        if (n <= 1){
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
