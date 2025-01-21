package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.awt.Color.getColor;
import static java.awt.SystemColor.text;

public class Main {

    public static void main(String[] args) {
        printFreeWords("Orange");
        printFreeWords("Banana");
        printFreeWords("Apple");
        checkSumSing();
        printColor();
        compareNumbers();
        getSum1();
        positiveNumber();
        positiveNumber1();
        print();
        leapYear();
        arr();
        arr100();
        returnArr(11, 3);
    }

    //1
    public static void printFreeWords(String text) {

        System.out.println(text);

    }

    //2
    public static void checkSumSing() {
        int a = 4;
        int b = -5;
        System.out.println(a + b);

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    private static void printColor() {
        int a = 10;

        if (a <= 0) {
            System.out.println("Красный");
        } else if (a > 0 && a <= 100) {
            System.out.println("Желтый");
        } else if (a > 100) {
            System.out.println("Зеленый");

        }

    }

    //4
    private static void compareNumbers() {
        int a = 2;
        int b = 3;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //5
    private static boolean getSum1() {
        int x = 6;
        int y = 8;
        int sum = x + y;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //6
    private static void positiveNumber() {
        int a = -7;
        if (a >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    //7
    private static boolean positiveNumber1() {
        int a = -7;
        if (a <= 0) {
            return true;
        } else {
            return false;
        }
    }

    // 8
    public static void print() {
        int m = 1;

        while (m <= 5) {
            System.out.println("Печать строки");
            m = m + 1;
//             или
//        for (int i = 0; i < 5 ;i++){
//            System.out.println("Печать строки");
        }

    }

    //9
    public static void leapYear() {
        for (int i = 0; i <= 400; i = i + 4) {
            if (i == 100 || i == 0) {
                continue;
            }
            System.out.println("Високосный год " + i);

        }
    }

    // 10
    private static void arr() {

        int[] a = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        a[3] = 1;
        a[4] = 1;
        a[5] = 0;
        a[6] = 0;
        a[7] = 0;
        a[8] = 0;
        a[9] = 0;
        System.out.println(Arrays.toString(a));
    }

    //    11
    public static void arr100() {
        int[] arr = new int[100];
        for (int i = 0; i <= 100; i++) {
            arr[i] = i;
            System.out.println(arr[i]);

        }

    }

    // 14
    private static int[] returnArr(int len, int initialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = initialValue;
        System.out.println(Arrays.toString(arr));
        return arr;

    }

}
