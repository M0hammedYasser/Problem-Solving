package com.java;

import java.util.Scanner;

public class BearAndBigBrother {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int year = 0;
        int limak = input.nextInt();//4
        int bob = input.nextInt();//7

        while(limak <= bob){
            year++;
            limak *=3;
            bob *=2;
        }

        System.out.println(year);
    }
}
