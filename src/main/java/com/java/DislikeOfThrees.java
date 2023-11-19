package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DislikeOfThrees {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        int x = 1;
        while (nums.size() < 1666) {
            if (x % 3 != 0 && x % 10 != 3) {
                nums.add(x);
            }
            x++;
        }
        int testCase = input.nextInt();
        for (int i = 0; i <testCase ; i++) {
            int num = input.nextInt();
            System.out.println(nums.get(num-1));
        }





    }
}