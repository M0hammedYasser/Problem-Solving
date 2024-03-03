package com.java;

import java.util.Scanner;

public class RedAndBlueBeans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            double r = input.nextDouble();
            double b = input.nextDouble();
            double d = input.nextDouble();
            System.out.println(solution(r, b, d) ? "YES" : "NO");
        }
    }

    public static boolean solution(double r, double b, double d) {
        if (r == b )
            return true;
        double result = Math.ceil(Math.max(r, b) / Math.min(r, b))-1;
        return result <= d;

    }
}
