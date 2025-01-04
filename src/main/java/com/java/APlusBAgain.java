package com.java;

import java.util.Scanner;

public class APlusBAgain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = input.nextInt();
            System.out.println(a%10 + a /10);
        }
    }
}
