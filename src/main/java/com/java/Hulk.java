package com.java.current;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String hate = "I hate ";
        String love = "I love ";
        String that = "that ";
        String it = "it ";


        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(hate);
                if (i != num)
                    System.out.print(that);
            } else {
                System.out.print(love);
                if (i != num)
                    System.out.print(that);
            }
        }

        System.out.print(it);

    }
}
