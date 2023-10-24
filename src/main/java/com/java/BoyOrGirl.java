package com.java;

import java.util.*;

public class BoyOrGirl {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.next();

        Set<Character> names = new HashSet<>();

        for (int i = 0; i < name.length(); i++) {
            names.add(name.charAt(i));
        }

        if (names.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

    }
}
