package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RestoringThreeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int x1 = input.nextInt();
            nums.add(x1);
        }
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(3) - nums.get(i);
            if (x != 0)
                System.out.println(x);
        }

    }
}
