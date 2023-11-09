package com.java;

import java.util.Scanner;

public class HitTheLottery {

    public static void main(String[] args) {
            long numOfDollars = new Scanner(System.in).nextInt();
            System.out.println(numOfPaper(numOfDollars));
    }

    public static long numOfPaper(long num) {
        long count;
        count = num / 100;

        num %= 100;
        count += num / 20;

        num %= 20;
        count += num / 10;

        num %= 10;
        count += num / 5;

        num %= 5;
        count += num;

        return count;

    }
}
