package com.company;

public class Main {

    public static void main(String[] args) {
        printArray(args);
    }

    private static void printArray(String[] args) {
        for(String i: args) {
            System.out.println(i);
        }
    }
}
