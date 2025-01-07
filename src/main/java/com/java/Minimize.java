package com.java;

import java.util.Scanner;

public class Minimize {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = a + b / 2;
            System.out.println((c-a) + (b-c));
        }

    }
}
