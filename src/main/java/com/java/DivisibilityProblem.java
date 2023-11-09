package com.java;

import java.util.Scanner;

public class DivisibilityProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfTestCasing = input.nextInt();
        double count = 0;

        for (int i = 0; i < numOfTestCasing; i++) {
            double A = input.nextDouble();
            double B = input.nextDouble();

            count = (Math.ceil(A / B)) * B;
            System.out.println((int)(count - A));
        }

    }
}

