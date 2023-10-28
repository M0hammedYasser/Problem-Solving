package com.java;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Long num = input.nextLong();
        System.out.println(function(num));

    }

    public static Long function(Long num) {
        if (num % 2 == 0)
            return num / 2;
        else
            return (num / 2) - num;

    }

}
