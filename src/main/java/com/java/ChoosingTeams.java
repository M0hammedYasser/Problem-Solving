package com.java;

import java.util.Scanner;

public class ChoosingTeams {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = input.nextInt();
        int k = input.nextInt();
        for (int i = 0; i < n; i++) {
            int y = input.nextInt();
            if (y + k <= 5)
                count++;

        }

        if (count < 3)
            System.out.println(0);
        else
            System.out.println(count/3);


    }
}
