package com.java;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int numOfTestCases = input.nextInt();
        for (int i = 0; i < numOfTestCases; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int max = Math.max(num1, Math.max(num2, num3));
            if (max == num1 && max == num2 + num3 ||
                    max == num2 && max == num1 + num3 ||
                    max == num3 && max == num1 + num2
            ) {
                System.out.println("YES");
            } else
                System.out.println("NO");


        }
    }

}
