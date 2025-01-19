package com.java;

import java.util.Scanner;

public class MyFirstSortingProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(x <= y ? x + " " + y : y + " " + x);
        }
    }
}
