package com.java;

import java.util.Scanner;

public class VanyaAndFence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        int numOfFriends = input.nextInt();
        int heightOfTheFence = input.nextInt();

        for (int i = 0; i <numOfFriends ; i++) {
            int heightOfFriends = input.nextInt();
            if (heightOfFriends>heightOfTheFence)
                count+=2;
            else
                count++;
        }
        System.out.println(count);
    }
}
