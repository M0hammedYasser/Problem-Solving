package com.java.current;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfTeam = input.nextInt();
        List<Integer> homes = new ArrayList<>();
        List<Integer> guests = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < numOfTeam ; i++) {
            int homeColor = input.nextInt();
            homes.add(homeColor);
            int guestColor = input.nextInt();
            guests.add(guestColor);
        }

        for (int i = 0; i <homes.size() ; i++) {
            for (int j = 0; j <guests.size() ; j++) {
                if (homes.get(i) == guests.get(j))
                    count++;
            }
        }
        System.out.println(count);

    }
}
