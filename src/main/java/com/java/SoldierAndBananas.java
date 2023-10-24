package com.java;

import java.util.Scanner;

public class SoldierAndBananas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        int sum = 0;
        int cost = input.nextInt();
        int dollars = input.nextInt();
        int numOfBanana = input.nextInt();


            for (int i = cost; i < (cost + 1); i++) {
                for (int j = 1; j <= numOfBanana; j++) {
                    x = i * j;
                    sum = sum + x;
                }
            }
            if (sum>dollars)
                System.out.println(sum - dollars);
            else
                System.out.println(0);


    }
}
