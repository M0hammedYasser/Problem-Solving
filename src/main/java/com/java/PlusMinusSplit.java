package com.java;

import java.util.Scanner;

public class PlusMinusSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            String s = input.next();
            int count = 0;
            for (int j = 0; j < n; j++)
                count = s.charAt(j) == '+' ? count + 1 : count - 1;
            System.out.println(Math.abs(count));
        }
    }
}
