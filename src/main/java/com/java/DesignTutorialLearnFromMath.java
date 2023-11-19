package com.java;

import java.util.Scanner;

public class DesignTutorialLearnFromMath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x =0  ;

        while (true) {
            n-=1;
            x = x + 1;

            if (!isPrime(n)&&!isPrime(x)) {
                System.out.println(n);
                System.out.println(x);
                break;
            }

        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return true;
        for (int i = 2; i < num; i++) {
            if ((num % i == 0))
                return false;
        }
        return true;
    }

}
