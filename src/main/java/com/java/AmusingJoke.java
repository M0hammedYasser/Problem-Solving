package com.java.current;

import java.util.Scanner;

public class AmusingJoke {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String guestName = input.next();
        String nameOfTheResidenceHost = input.next();
        String lettersInAPile = input.next();
        char[] l1 = guestName.toCharArray();
        char[] l2 = nameOfTheResidenceHost.toCharArray();
        char[] l3 = lettersInAPile.toCharArray();
        int count = 0;

        for (int i = 0; i < l1.length; i++) {
            for (int j = 0; j < l3.length; j++) {
                if (l1[i] == l3[j]) {
                    count++;
                    l3[j] ='0';
                    break;
                }
            }
        }
        for (int i = 0; i < l2.length; i++) {
            for (int j = 0; j < l3.length; j++) {
                if (l2[i] == l3[j]) {
                    count++;
                    l3[j] ='0';
                    break;
                }
            }
        }

        if (count == (guestName.length() + nameOfTheResidenceHost.length())&& (l3.length==(l1.length)+l2.length))
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
