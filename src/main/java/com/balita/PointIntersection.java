package com.balita;

import java.util.Scanner;

public class PointIntersection {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        System.out.print("First number : ");
        firstNumber = new Scanner(System.in).nextInt();

        System.out.println();
        System.out.print("Second number : ");
        secondNumber = new Scanner(System.in).nextInt();

        System.out.println("The entryPoint is " + entryPoint(firstNumber, secondNumber));

    }

    private static int entryPoint(int firstNumber, int secondNumber) {
        do {
            firstNumber = cumul(firstNumber);
            System.out.println("First number : " + firstNumber);
            secondNumber = cumul(secondNumber);
            System.out.println("Second number : " + secondNumber);
        } while (firstNumber != secondNumber);
        return firstNumber;
    }

    private static int cumul(int number) {
        int value = number;
        while (number != 0) {
            value += number % 10;
            number /= 10;
        }
        return value;
    }
}
