package com.java;

import java.util.Scanner;

public class QueueAtTheSchool {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numOfStudents = input.nextInt();
        int numOgMoves = input.nextInt();
        String gender = input.next();
        char[] genders = gender.toCharArray();


        for (int i = 0; i < numOgMoves; i++) {
            if (i != genders.length-1) {
                if (genders[i] == 'B' && genders[i + 1] == 'G') {
                }
            }
        }
        System.out.println(genders);


    }

}
