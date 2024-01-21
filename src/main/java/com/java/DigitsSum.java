package com.java;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long n = input.nextLong();
            System.out.println((int) Math.floor((n + 1) / 10));
        }
    }

}