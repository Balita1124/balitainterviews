package com.balita;

public class PalindromeInt {

    public static void main(String[] args) {
        int number = 1002;
//        while (number > 0) {
//            System.out.println(number % 10);
//            number = number / 10;
//        }

        System.out.println("Another way : ");

        for (; number > 0; number /= 10) {
            System.out.println(number % 10);
        }
    }

}
