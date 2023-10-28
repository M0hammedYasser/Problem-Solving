package com.java;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfFriends = input.nextInt();
        int[] nums = new int[numOfFriends + 1];

        for (int i = 1; i <= numOfFriends; i++) {
            nums[input.nextInt()] = i;
        }
        for (int i = 1; i <= numOfFriends; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
