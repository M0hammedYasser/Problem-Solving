package com.java;

import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            String s = input.next();
            int count = 0;
            for (int j = 0; j < n; ) {
                if (s.charAt(j) == 'B') {
                    j = Math.min(n, j + k);
                    count++;
                } else j++;


            }
            System.out.println(count);
        }

    }
}
