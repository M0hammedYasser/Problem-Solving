package com.java.current;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseshoeOnTheOtherHoof {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Integer> colors = new HashSet<>();

        for (int i = 0; i <4 ; i++) {
            int valera = input.nextInt();
            colors.add(valera);
        }

        System.out.println(4- colors.size());

    }
}
