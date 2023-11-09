package com.java;

import java.util.*;

public class Pangram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String word = input.next();
        System.out.println(checkWord(word));


    }
    public static String checkWord(String name) {
        char[] words = name.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(Character.toUpperCase(words[i]));
        }
        if (set.size() >= 26)
            return "YES";
        else
            return "NO";
    }
}
