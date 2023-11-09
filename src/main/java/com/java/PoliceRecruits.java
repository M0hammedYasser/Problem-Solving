package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        List<Integer> numbers = new ArrayList<>();
        int nums, count = 0, v = 0;

        for (int i = 0; i < num; i++) {
            nums = input.nextInt();
            numbers.add(nums);

            if (nums > 0)
                v+=nums;

            if (nums == -1 && v > 0)
                v--;

            else if (nums ==-1 && v==0)
                count++;


        }
        System.out.println(count);
    }
}
