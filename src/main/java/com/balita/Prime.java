package com.balita;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int nb;
        do {
            System.out.print("Entrez le nombre: ");
            nb = new Scanner(System.in).nextInt();
            System.out.println(nb + (isPrime(nb) ? " est " : " n'est pas ") + "premier");
        } while (nb != 0);
    }

    private static boolean isPrime(int nb) {
        if (nb < 2) return false;
        int sqrt = (int) Math.sqrt(nb) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (nb % i == 0) return false;
        }
        return true;
    }
}
