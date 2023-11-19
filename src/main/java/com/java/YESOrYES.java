package com.java;

import java.util.Scanner;

public class YESOrYES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfTestCases = input.nextInt();

        for (int i = 0; i < numOfTestCases; i++) {
            String testCase = input.next();
            if (testCase.toUpperCase() .equals("YES") )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
