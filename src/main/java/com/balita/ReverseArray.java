package com.balita;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] names = {"faby", "rico", "rojo", "ranto", "nasa"};
        System.out.println("The reverse of " + Arrays.toString(names) + " is " + Arrays.toString(reverse(names)));
    }

    private static String[] reverse(String[] names) {
        String[] reversedArray = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            reversedArray[i] = names[names.length - i - 1];
        }
        return reversedArray;
    }
}
