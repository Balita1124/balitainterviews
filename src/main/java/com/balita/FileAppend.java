package com.balita;

import java.io.*;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Data/test.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append("\nTsisy namana a");
        bufferedWriter.close();

//        Reading file
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.lines().forEach(System.out::println);
    }
}
