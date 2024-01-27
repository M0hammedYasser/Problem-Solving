package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EshagLovesBigArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Double> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextDouble());
			}

			double avg = (max(list) + lastMax(list)) / 2;

			int count = 0;
			for (Double integer : list) {
				if (integer > avg)
					count++;

			}
			System.out.println(count);

		}

	}

	private static double max(List<Double> list) {
		if (list.size() == 1) {
			return list.get(0);
		}
		List<Double> list2 = new ArrayList<>(list);
		Collections.sort(list2);
		return list2.get(0);
	}

	private static double lastMax(List<Double> list) {
		if (list.size() == 1) {
			return list.get(0);
		}
		List<Double> list2 = new ArrayList<>(list);
		Collections.sort(list2);
		return list2.get(1);
	}

}
