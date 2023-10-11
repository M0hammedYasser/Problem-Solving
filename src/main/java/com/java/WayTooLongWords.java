package com.java;


import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOfWords = input.nextInt();

        for (int i = 1; i <= numOfWords; i++) {
            String word = input.next();
            System.out.println(testWord(word));
        }
    }
    public static String testWord(String word) {

        if (word.length() <= 10)
            return word;
        else {
            String s = String.valueOf(word.length() - 2);
            return word.charAt(0) + s + word.charAt(word.length() - 1);
        }

    }
}








