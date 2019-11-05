package com.balita;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("nasa", "ranto", "rojo", "rico", "faby");
        List<String> namesUpper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("names" + names);
        System.out.println("namesUpper" + namesUpper);
    }
}
