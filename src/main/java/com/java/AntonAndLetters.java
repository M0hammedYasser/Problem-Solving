package com.java.current;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] words = word.toCharArray();
        Set<Character> letters = new HashSet<>();

        for (int i = 1; i < words.length - 1; i += 3) {
            letters.add(words[i]);
        }

        System.out.println(letters.size());
    }
}
