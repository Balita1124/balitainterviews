package com.balita;

import java.util.Scanner;

public class PalindromeInt {

    public static void main(String[] args) {
        int number = 0;
        do {
            System.out.print("Entrer un nombre : ");
            number = new Scanner(System.in).nextInt();
            System.out.println(number + " " + (isPalindrome(number) ? "is a palindrome" : "is not a palindrome"));
        } while (number != 0);
    }

    private static boolean isPalindrome(int number) {
        int initialNumer = number;
        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println("number is " + number);
        System.out.println("Reverse is " + reverseNumber);
        return initialNumer == reverseNumber;
    }

}
