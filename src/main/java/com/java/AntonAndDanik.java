package com.java;

import java.util.Scanner;

public class AntonAndDanik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int numOfPlay = input.nextInt();
        String result = input.next();
        char[] results = result.toCharArray();

        for (char c : results) {
            if (c == 'A')
                count++;
            if (c == 'D')
                count--;
        }

        if (count > 0)
            System.out.println("Anton");
        else if (count < 0)
            System.out.println("Danik");
        else
            System.out.println("Friendship");

    }
}
