package com.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {

    public static void main(String[] args) {

        int year = new Scanner(System.in).nextInt();

        while (true) {
            year++;
            if (checkLength(year) == 4) {
                System.out.println(year);
                break;
            }
        }

    }

    public static int checkLength(int num) {
        Set<Character> chars = new HashSet<>();
        String year = Integer.toString(num);
        char[] years = year.toCharArray();
        for (char c : years) {
            chars.add(c);
        }
        return chars.size();
    }
}
