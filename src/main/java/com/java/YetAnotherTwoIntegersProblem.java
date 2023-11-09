package com.java;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfTestCases = input.nextInt();

        for (int i = 0; i < numOfTestCases; i++) {
            int testCase1 = input.nextInt();
            int testCase2 = input.nextInt();
            System.out.println(minRequiredNum(testCase1, testCase2));
        }
    }

    public static int minRequiredNum(int num1, int num2) {

            int subtract = Math.abs(num1 - num2);
            int count = 0;
            for (int i = 10; i >= 1; i--) {

                if (subtract >= i) {
                    int s = subtract;
                    subtract %= i;
                    count += s / i;
                }

            }

            return count;
        }

}
