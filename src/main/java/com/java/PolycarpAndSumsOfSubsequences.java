package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PolycarpAndSumsOfSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < 7; j++) {
				list.add(input.nextInt());
			}
			Collections.sort(list);
			System.out.println(list.get(0) + " " + list.get(1) + " "
					+ (list.get(0) + list.get(1) + list.get(2) == list.get(6) ? list.get(2) : list.get(3)));

		}
	}

}
