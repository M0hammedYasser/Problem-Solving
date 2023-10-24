package com.java;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int max = 0;
        int numOfStations = scanner.nextInt();

        for (int i = 0; i < numOfStations; i++) {
            int output = scanner.nextInt();
            int input = scanner.nextInt();

            count = count + (input - output);
            if (max <= count)
                max = count;
        }
        System.out.println(max);
    }

}
