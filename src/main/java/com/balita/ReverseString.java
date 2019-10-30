package com.balita;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.print("Entrez le string: ");
        String str = new Scanner(System.in).nextLine();
        String reverseStr = reverse(str);
        System.out.println(reverseStr);
    }

    private static String reverse(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
