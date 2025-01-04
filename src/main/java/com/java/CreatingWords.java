package com.java;

import java.util.Scanner;

public class CreatingWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String a = input.next();
            String b = input.next();
            char temp = b.charAt(0);
            b = a.charAt(0) + b.substring(1);
            a = temp + a.substring(1);
            System.out.println(a + " " + b);
        }
    }
}
