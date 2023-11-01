package com.java.current;

import java.util.Scanner;

public class ILoveUseName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfContests = input.nextInt();

        int points = input.nextInt();
        int max = points, min = points, count = 0;
        for (int i = 1; i < numberOfContests; i++) {
             points = input.nextInt();
            if (points > max) {
                max = points;
                count++;
            }
            if (points < min) {
                min = points;
                count++;
            }
        }
        System.out.println(count);
    }
}
