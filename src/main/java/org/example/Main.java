package org.example;

import static org.example.CalculateFactorial.calculateFactorial;

public class Main {
    public static void main(String[] args) {

        int n = 3;
        long result = calculateFactorial(n);
        System.out.println("Факториал " + n + " = " + result);
    }
}
