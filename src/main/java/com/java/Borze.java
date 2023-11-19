package com.java;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.next();
        char[] words = word.toCharArray();

        for (int i = 0; i < words.length; i++) {


            if (i < words.length - 1 && words[i] == '.' && ((words[i + 1] == '-')))
                System.out.print(0);
            if (words[i] == '.' && i == words.length - 1) {
                System.out.print(0);
                break;
            }
            if (words[i] == '.' && (words[i+1] == '.')) {
                System.out.print(0);
                System.out.print(0);
                i++;
            }
            if (i < words.length - 1 && words[i] == '-' && words[i + 1] == '.') {
                System.out.print(1);
                i++;
            }

            if (i < words.length - 1 && words[i] == '-' && words[i + 1] == '-') {
                System.out.print(2);
                i++;
            }


        }


    }
}
