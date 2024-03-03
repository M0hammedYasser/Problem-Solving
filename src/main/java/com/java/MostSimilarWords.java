package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostSimilarWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String s = input.next();
                list.add(s);
            }

            System.out.println(solution(list));

        }
    }


    private static int solution(List<String> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int diff = diff(list.get(i) , list.get(j));
                min = Math.min(diff, min);
            }
        }
        return min;
    }

    private static int diff(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++)
            count += Math.abs((int) str1.charAt(i) - (int) str2.charAt(i));
        return count;
    }
}
