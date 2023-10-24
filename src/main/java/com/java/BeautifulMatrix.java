package com.java;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int x = input.nextInt();
                matrix[i][j] = x;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    int weigh =Math.abs( 2 - i);
                    int length = Math.abs( 2 - j);
                    System.out.println(weigh + length);

                }

            }
        }
    }
}
