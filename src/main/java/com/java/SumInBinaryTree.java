package com.java;

import java.util.Scanner;

public class SumInBinaryTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long n = input.nextLong();
            long sum = 0;
            for (long j = n; j > 0; j=j/2) {
                sum += j;
            }
            System.out.println(sum);
        }
    }
}
