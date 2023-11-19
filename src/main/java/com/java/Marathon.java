package com.java;

import java.util.Scanner;

public class Marathon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int numOfTestCases = input.nextInt();
        for (int i = 0; i < numOfTestCases; i++) {
            int a, b, c, d, count = 0;
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            if (b > a) count++;
            if (c > a) count++;
            if (d > a) count++;
            System.out.println(count);
        }

    }
}
