package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InSearchOfAnEasyProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPeople = input.nextInt();
        List<Integer> rates = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            int rate = input.nextInt();
            rates.add(rate);
        }
        if (rates.contains(1))
            System.out.println("HARD");
        else
            System.out.println("EASY");

    }

}
