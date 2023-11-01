package com.java.current;

import java.util.Scanner;

public class FoxAndSnake {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0  || j == n && i % 4 != 0 || j == 1 && i % 4 == 0)
                    System.out.print('#');
                else
                    System.out.print('.');
            }
            if (!(i == m))
                System.out.println("");
        }
    }
}
