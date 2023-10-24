package com.java;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        int count = 0;

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i]))
                count++;
            else
                count--;
        }

        if (count > 0)
            System.out.println(word.toUpperCase());
        if (count <= 0)
            System.out.println(word.toLowerCase());


    }
}
