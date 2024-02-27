package com.java;

import java.util.Scanner;

public class EscalatorConversations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            int H = input.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                int h = input.nextInt() ;
                if ((H- h) % k == 0 && Math.abs(H-h) /k < m && H != h)
                    count++;
            }

            System.out.println(count);
        }
    }
}
