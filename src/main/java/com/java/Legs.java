package com.java;

import java.util.Scanner;

public class Legs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            System.out.println(n % 4 == 0 ? n / 4 : n / 4 + 1);
        }
    }
}
