package org.example;

public class CalculateFactorial {
    public static long calculateFactorial(int n) {

        long factorial = 1;
        for (int i = 1; i <= n; i = i + 1) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
