package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;

        int numOfMagnets = input.nextInt();
        List<Integer> pieces =new ArrayList<>();

        for (int i = 0; i < numOfMagnets; i++) {
            int magnet = input.nextInt();
            pieces.add(magnet);
        }

        for (int i = 0; i <pieces.size() ; i++) {
            if (!(i == pieces.size()-1)){
            if(!pieces.get(i).equals(pieces.get(i + 1)))
                count++;
        }}
        System.out.println(count);
    }
}
