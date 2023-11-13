package com.java;

import java.util.*;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfTestCases = input.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            int length = input.nextInt();
            Set<Integer> nums = new HashSet<>();
            for (int j = 0; j < length; j++) {
                int testCase = input.nextInt();
                nums.add(testCase);
            }
            List<Integer> numsList = new ArrayList<>(nums);

            if (isObtain(numsList))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
    public static boolean isObtain (List<Integer> nums) {
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {

            if (i !=nums.size()-1){
                if (nums.get(i) - nums.get(i + 1) != -1) { // 1  2   4
                    return false;
                }}

        }
        return true;
    }
}
