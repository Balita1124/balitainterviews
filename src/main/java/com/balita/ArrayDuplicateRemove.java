package com.balita;

import java.util.*;

public class ArrayDuplicateRemove {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(3);
        primes.add(7);
        System.out.println("Initial Array" + primes);
        Set<Integer> primesUniq = new LinkedHashSet<Integer>(primes);
        System.out.println("Uniq array" + primesUniq);
        Collections.reverse(primes);
        System.out.println("Reversed array" + primes);
    }
}
