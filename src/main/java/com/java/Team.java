package com.java;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        int count=0;
        Scanner input = new Scanner(System.in);
        int numOfProblems = input.nextInt();

        for (int i = 1; i <= numOfProblems; i++) {
            int petya = input.nextInt();
            int vasya = input.nextInt();
            int tonya = input.nextInt();


            while (isAnswer(petya,vasya,tonya)){
                count++;
                break;
            }

        }
        System.out.println(count);

    }

    public static boolean isAnswer(int x ,int y ,int z){
        if (x ==1 && y ==1)
            return true;
        else if (x ==1 && z ==1)
            return true;
        else if (y ==1 && z ==1)
            return true;
        else
            return false;
    }
}
