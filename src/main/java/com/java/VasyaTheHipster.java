package com.java;

import java.util.Scanner;

public class VasyaTheHipster {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(smallest(a,b));
        System.out.println((Math.abs(a-b)) / 2);
    }
    public static int smallest(int x , int y){
        if (y > x) return x; else return y;
    }
}
