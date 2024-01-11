package com.java;

import java.util.Scanner;
public class FoodForAnimals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            long c = input.nextLong();
            long x = input.nextLong();
            long y = input.nextLong();
            x = x - a;
            y = y - b;
            x = x < 0 ? 0 : x;
            y = y < 0 ? 0 : y;
            System.out.println(x <= 0 && y <= 0 || x + y <= c ? "YES" : "NO");
        }
    }
}
