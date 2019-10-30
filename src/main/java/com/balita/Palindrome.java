package com.balita;

import java.util.Scanner;

/**
 * You need to write a simple Java program to check if a given String is palindrome or not.
 * A Palindrome is a String which is equal to the reverse of itself,
 * e.g., "Bob" is a palindrome because of the reverse of "Bob" is also "Bob."
 */
public class Palindrome {
    public static void main(String[] args) {

        String text;
        do {
            System.out.print("Entrer le text: ");
            text = new Scanner(System.in).nextLine();
            System.out.println(text + (isPalindrome(text) ? " est un " : " n'est pas un ") + "Palindrome");
        } while (!"quit".equals(text));
    }

    private static boolean isPalindrome(String text) {
        if (text.length() < 3) return false;
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            reverse.insert(0, text.charAt(i));
        }
        return (text.toUpperCase()).equals(reverse.toString().toUpperCase());
    }

    public static String reverse2(String input){
        if(input == null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length()- 1) + reverse2(input.substring(0, input.length() - 1));
    }
}
