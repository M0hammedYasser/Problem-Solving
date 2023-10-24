package com.java;

import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        String firstLine = input.next().toLowerCase();
        String secondLine = input.next().toLowerCase();

        for (int i = 0; i < firstLine.length(); i++) {
            char chFirstLine = firstLine.charAt(i);
            char chSecondLine = secondLine.charAt(i);
            if (chFirstLine > chSecondLine) {
                num = 1;

                break;
            }

            else if (chFirstLine < chSecondLine) {
                num = -1;

                break;
            }

            else {
                num=0;
                continue;
            }
        }
        System.out.println(num);

    }
}
