package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HolidayOfEquality {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfTestCitizens = input.nextInt();
        int max, sum = 0;
        List<Integer> citizens = new ArrayList<>();
        for (int i = 0; i < numOfTestCitizens; i++) {
            citizens.add(input.nextInt());
        }
        Collections.sort(citizens);
        max = citizens.get(numOfTestCitizens - 1);
        for (int i = 0; i < citizens.size()-1; i++) {
            sum  = sum+(max-citizens.get(i));
        }
        System.out.println(sum);
    }
}
