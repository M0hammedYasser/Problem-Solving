package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        int sum = (Math.abs(avg(x1,x2,x3)-x1))
                 +(Math.abs(avg(x1,x2,x3)-x2))
                 +(Math.abs(avg(x1,x2,x3)-x3));
        System.out.println(sum);


    }

    public static int avg(int x1, int x2, int x3) {
        List <Integer> nums = new ArrayList<>();
        nums.add(x1);nums.add(x2);nums.add(x3);

        Collections.sort(nums);
        return nums.get(1);
    }
}
