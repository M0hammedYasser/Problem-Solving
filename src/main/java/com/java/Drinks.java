package com.java;

import java.util.Scanner;

public class Drinks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int numOfOrangeContaining = input.nextInt();

        for (int i = 0; i < numOfOrangeContaining; i++) {
           int  volumeFractionOfOrange = input.nextInt();
            sum +=volumeFractionOfOrange;
        }
        System.out.println((double) sum/(numOfOrangeContaining));

    }
}
