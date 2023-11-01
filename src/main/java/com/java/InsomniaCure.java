package com.java.current;

import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, l, m, n, d;
        k = input.nextInt();
        l = input.nextInt();
        m = input.nextInt();
        n = input.nextInt();
        d = input.nextInt();

        int count = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 ||i % l == 0 || i % m == 0 ||i % n == 0)
                count ++;
        }
        System.out.println(count);

    }
}
