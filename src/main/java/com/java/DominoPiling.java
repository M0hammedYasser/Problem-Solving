package com.java;

import java.util.Scanner;

public class DominoPiling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int M = input.nextInt();
        int N = input.nextInt();

        int result = (int) Math.floor((M*N)/2);

        System.out.println(result);
    }
}
