package com.java;

import java.util.Scanner;

public class BuyAShovel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int count = 1, k, r;
        k = input.nextInt();
        r = input.nextInt();
        final int x = k;

        while (true) {
            if (k % 10 == r || k % 10 == 0)
                break;
            else {
                count++;
                k += x;
            }
        }

        System.out.println(count);


    }
}
