package com.java.current;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstLine = input.next();
        String secondLine = input.next();

        char[] first = firstLine.toCharArray();
        char[] second = secondLine.toCharArray();
        char[] result = new char[firstLine.length()];

        for (int i = 0; i < firstLine.length(); i++) {
            if (first[i] == second[i])
                result[i] = '0';
            else
                result[i] = '1';
        }
        System.out.println(result);
    }
}
