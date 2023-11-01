package com.java.current;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfLevel = input.nextInt();
        Set<Integer> solutions = new HashSet<>();

        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            int solution = input.nextInt();
            solutions.add(solution);
        }

        int y = input.nextInt();
        for (int i = 0; i < y; i++) {
            int solution = input.nextInt();
            solutions.add(solution);
        }

        if (solutions.size() == numOfLevel)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");


    }
}
