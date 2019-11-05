package com.balita.vending;

import java.util.*;

public class Vending {

    public static void main(String[] args) {
        Map<Integer, String> cmdList = new HashMap<>();
        cmdList.put(1, "BLACK TEA");
        cmdList.put(2, "GREEN TEA");
        cmdList.put(3, "CAPUCCINO");
        cmdList.put(4, "BLACK COFFEE");
        cmdList.put(0, "QUIT");
        Map<Integer, Integer> priceList = new HashMap<>();
        priceList.put(1, 5);
        priceList.put(2, 7);
        priceList.put(3, 15);
        priceList.put(4, 20);

        int cmd = 0;
        do {
            for (int i = 0; i < 50; i++) System.out.print("*");
            System.out.println();
            cmdList.forEach((id, command) -> {
                for (int i = 0; i < 15; i++) System.out.print(" ");
                System.out.print(id + " - " + command);
                System.out.println();
            });
            for (int i = 0; i < 50; i++) System.out.print("*");
            System.out.println();
            System.out.print("Choice : ");
            cmd = new Scanner(System.in).nextInt();

        } while (cmd != 0);
    }

    private static boolean notMainCommand(int cmd) {
        List<Integer> cmdList = Arrays.asList(0, 1, 2, 3, 4, 5);
        return false;
    }
}
