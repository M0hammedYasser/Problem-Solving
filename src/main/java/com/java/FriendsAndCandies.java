package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendsAndCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt(), sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				int a = input.nextInt();
				list.add(a);
				sum += a;
			}
			int avg = sum / n;
			int count = 0;
			for (int num : list) {
				if (num > avg) {
					count++;
				}
			}
			System.out.println(sum % n == 0 ? count : -1);
		}

	}

}
