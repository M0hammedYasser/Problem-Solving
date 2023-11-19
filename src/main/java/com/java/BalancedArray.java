package com.java;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            int sumPos = 0, sumNeg = 0;
            int n = input.nextInt();//n =4
            if ((n / 2) % 2 == 0) {
                System.out.println("YES");
                for (int j = 2; j < n + 2; j += 2) {
                    System.out.print(j + " ");
                    sumPos = sumPos + j;
                }


                for (int j = 1; j < n - 2; j += 2) {
                    System.out.print(j + " ");
                    sumNeg = sumNeg + j;
                }
                System.out.print(sumPos - sumNeg + " ");
                System.out.print("\n");
            } else
                System.out.println("NO");
        }

    }
}
