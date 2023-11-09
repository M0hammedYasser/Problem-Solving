package com.java;

import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int testCase = input.nextInt();
            System.out.println(numOfWay(testCase));
        }
    }

    public static int numOfWay(int num) {
        if (num <= 2)
            return 0;
        else {
            if (num % 2 != 0)
                return num / 2;
            else
                return (num / 2) - 1;
        }
    }

}

