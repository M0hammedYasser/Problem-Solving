package com.java;

import java.util.*;

public class StonesOnTheTable {
    public static void main(String[] args) {

        int count =0;
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String stone = input.next();
        char[] stones =stone.toCharArray();

        for (int i = 0; i <num-1 ; i++) {

            if (stones[i]==stones[i+1] && i !=(num-1)){
                count++;
            }

        }
        System.out.println(count);

    }

}
