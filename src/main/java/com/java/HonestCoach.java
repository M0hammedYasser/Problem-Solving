package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HonestCoach {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		for (int i = 0; i < test; i++) {
			List<Integer> list = new ArrayList<Integer>();

			int n = input.nextInt();
			for (int j = 0; j < n; j++) {
				int s = input.nextInt();
				list.add(s);

			}
			System.out.println(minValue(list));
		}

	}

	public static int minValue(List<Integer> list) {
		Collections.sort(list, Collections.reverseOrder());
		int min = 1000;
		for (int i = 0; i < list.size()-1; i++) {
			int value =  list.get(i) -  list.get(i+1);
			if (value< min) {
				min = value;
			}
		}
		return min;
	}

}
