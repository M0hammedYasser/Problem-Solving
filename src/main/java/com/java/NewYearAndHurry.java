package com.java;

import java.util.Scanner;

public class NewYearAndHurry {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfTheProblems = input.nextInt();
        int minutes = input.nextInt();
        int netMinute = 240 - minutes;


        if (add(netMinute) <= numberOfTheProblems)
            System.out.println(add(netMinute));
        else
            System.out.println(numberOfTheProblems);

    }

    public static int add(int minute) {
        int count = 0;
        for (int i = 1; i <= minute; i++) {
            if (minute < 5 * i)
                break;
            else {
                minute = minute - (5 * i);
                count++;
            }
        }
        return count;
    }


}
