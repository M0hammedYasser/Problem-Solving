package com.java;

import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {

        int count = 0;

        Scanner input = new Scanner(System.in);
        int numOfContestant = input.nextInt();
        int indexOfContestant = input.nextInt();
        int[] scores = new int[numOfContestant];


        for (int i = 0; i < numOfContestant; i++) {
            int score = input.nextInt();
            scores[i] =score;
            if (score >= scores[indexOfContestant-1] && score !=0) {
                count++;
            }
        }
        System.out.println(count);


    }
}
