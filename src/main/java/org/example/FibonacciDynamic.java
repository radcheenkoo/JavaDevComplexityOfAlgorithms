package org.example;

public class FibonacciDynamic {
    private int[] fib;

    public FibonacciDynamic(int n){
        fib = new int[n + 1];
        fib[1] = 1;
    }

    public int calculateFibonacci(int n){

        for (int i = 2; i <= n; i++){

            fib[i] = fib[i - 1] + fib[i - 2];

        }
        return fib[n];
    }

}
