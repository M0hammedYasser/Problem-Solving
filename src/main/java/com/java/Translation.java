package com.java;

import java.util.Scanner;

public class Translation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        StringBuilder stringBuilder = new StringBuilder(word);
        word = stringBuilder.reverse().toString();
        String tran = input.next();

        if (word.equals(tran))
            System.out.println("YES");
        else
            System.out.println("NO");

    }


}
