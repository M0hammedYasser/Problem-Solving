package com.java;

import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            System.out.println(n-1);
        }
    }
}
