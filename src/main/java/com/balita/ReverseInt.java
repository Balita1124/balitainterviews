package com.balita;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int nbr = 0;
//        do {
        System.out.print("Entrez l'entier : ");
        nbr = new Scanner(System.in).nextInt();
        int reverseNbr = reverse(nbr);
        System.out.println(reverseNbr);
//        } while (nbr != 0);
    }

    public static int reverse(int nbr) {
        int reverseNbr = 0;
        while (nbr != 0) {
            System.out.println(nbr);
            reverseNbr = reverseNbr * 10 + nbr % 10;
            nbr = nbr / 10;
        }
        return reverseNbr;
    }

    public static int reverse2(int nbr) {
        if (nbr < 10) return nbr;
        System.out.println(nbr % 10 * 10);
        return  reverse(nbr / 10) + (nbr % 10) * 10;
    }
}
