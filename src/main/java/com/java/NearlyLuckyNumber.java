package com.java;

import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        Long num = input.nextLong();
        String sNum = num.toString();
        char[] nums = sNum.toCharArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '4' || nums[i] == '7')
                count++;
        }

        if (count == 4 || count == 7)
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
