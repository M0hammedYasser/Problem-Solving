package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String oper = input.next();

        List opers = new ArrayList<>();

        for (int i = 0; i < oper.length(); i += 2) {
            opers.add(oper.charAt(i));
        }

        for (int i = 0; i < opers.size(); i++) {
            Collections.sort(opers);
        }


        for (int i = 0; i < opers.size(); i++) {
            System.out.print(opers.get(i));
            if(!(i== opers.size()-1))
            System.out.print("+");
        }


    }
}
