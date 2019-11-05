package com.balita;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int number = 0;
        do {
            System.out.print("Entrer un nombre : ");
            number = new Scanner(System.in).nextInt();
            System.out.println(number + " " + (isArmstrong(number) ? "is a Armstrong number" : "is not a Armstrong number"));
        } while (number != 0);
    }

    private static boolean isArmstrong(int number) {
        int initialNumber = number;
        int result = 0;
        while (number != 0) {
            result = (result + (int) Math.pow((number % 10), 3));
            number /= 10;
        }
        return initialNumber == result;
    }
}
