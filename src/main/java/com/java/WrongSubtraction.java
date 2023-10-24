package com.java;

import java.util.Scanner;

public class WrongSubtraction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num  = input.nextInt();
        int oper = input.nextInt();

        for (int i = 0; i < oper; i++) {
            if (num %10 ==0)
                num /=10;
            else
                num--;
        }
        System.out.println(num);


    }
}
