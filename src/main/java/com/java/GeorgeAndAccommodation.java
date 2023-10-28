package com.java;

import java.util.Scanner;

public class GeorgeAndAccommodation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;
        int numberOfAccommodation = input.nextInt();
        for (int i = 0; i < numberOfAccommodation; i++) {
            int numOfPeople = input.nextInt();
            int size = input.nextInt();
            if (size - numOfPeople >= 2)
                count++;
        }
        System.out.println(count);
    }


}
