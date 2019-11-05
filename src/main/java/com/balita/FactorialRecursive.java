package com.balita;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        int number = 0;
        System.out.print("Enter a number: ");
        number = new Scanner(System.in).nextInt();
        System.out.println(number + "! = " + factorial(number));
    }

    private static int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }
}
