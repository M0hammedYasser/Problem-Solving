package com.java;

import java.util.Scanner;

public class IamBoredWithLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long A = input.nextLong();
        long B = input.nextLong();
        System.out.println(factorial(Math.min(A, B)));
    }
    public static long factorial(long num) {
        if (num == 1 || num == 2)
            return num;
        else return factorial(num - 1) * num;
    }


}

