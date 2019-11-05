package com.balita;

import java.util.Scanner;

public class FactoralLoop {
    public static void main(String[] args) {
        int number = 0;
        System.out.print("Enter a number: ");
        number = new Scanner(System.in).nextInt();
        System.out.println(number + "! = " + factorial(number));

    }

    private static int factorial(int number) {
        int result = 1;
        while (number != 0) {
            result *= number;
            number--;
        }
        return result;
    }
//    private static int factorial(int number) {
//        int result = 0;
//        for (int i = 1; i <= number; i++) {
//            if (i == 1) {
//                result = 1;
//                System.out.print(i);
//            } else {
//                result = result * i;
//                System.out.print(" x " + i);
//            }
//        }
//        return result;
//    }
}
