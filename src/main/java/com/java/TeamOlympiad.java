package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamOlympiad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0, s1 = 0, s2 = 0, s3 = 0;
        int numOfTestChildren = input.nextInt();
        List<Integer> skills = new ArrayList<>();
        for (int i = 0; i < numOfTestChildren; i++) {
            skills.add(input.nextInt());
        }
        List<Integer> mohamed = new ArrayList<>(skills);
        while (true) {
            if (skills.contains(1) && skills.contains(2) && skills.contains(3)) {
                count++;
                skills.remove(skills.indexOf(1));
                skills.remove(skills.indexOf(2));
                skills.remove(skills.indexOf(3));
            } else break;
        }

        System.out.println(count);
        for (int i = 0; i <count ; i++) {
            System.out.println(mohamed.indexOf(1)+1);
            System.out.println(mohamed.indexOf(2)+1);
            System.out.println(mohamed.indexOf(3)+1);
            mohamed.set(mohamed.indexOf(1),-1);
            mohamed.set(mohamed.indexOf(2),-1);
            mohamed.set(mohamed.indexOf(3),-1);
        }



    }
}
