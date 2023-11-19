package com.java;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        for (int i = 0; i < testCase; i++) {
            String digit = input.next();
            char[] digits = digit.toCharArray();
            if (digits[0] + digits[1] + digits[2] == digits[3] + digits[4] + digits[5])
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}
