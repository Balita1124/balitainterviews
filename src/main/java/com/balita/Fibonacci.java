package com.balita;

import java.util.Scanner;

/**
 * Java program to calculate and print Fibonacci number using recursion
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 *
 * @author Rico
 */

public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("Entrez le nombre de serie a faire: ");
        int nb = new Scanner(System.in).nextInt();
        for (int i = 1; i <= nb; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int val) {
        if (val == 1 || val == 2) return 1;
        return fibonacci(val - 1) + fibonacci(val - 2);
    }
}
