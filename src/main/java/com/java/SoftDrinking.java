package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numOfFriends = input.nextInt();
        int numOfBottles = input.nextInt();
        int numOfMilliliters = input.nextInt();
        int numOfLimes = input.nextInt();
        int numOfLimesSlices = input.nextInt();
        int gramsOfSalt = input.nextInt();
        int nl = input.nextInt();
        int np = input.nextInt();

        int millis = numOfMilliliters * numOfBottles;
        int milleNeeded = millis / nl;
        int saltNeeded = gramsOfSalt / np;
        int sliceLimesNeeded = numOfLimes * numOfLimesSlices;


        System.out.println(smallest(milleNeeded,
                saltNeeded, sliceLimesNeeded) / numOfFriends);


    }

    public static int smallest(int... nums) {
        return Arrays.stream(nums).min().getAsInt();
    }
}
