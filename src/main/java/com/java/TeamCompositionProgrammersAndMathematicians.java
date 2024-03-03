package com.java;

import java.util.Scanner;

public class TeamCompositionProgrammersAndMathematicians {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            System.out.println(Math.min(a, Math.min(b, (a + b) / 4)));
        }
    }
}
