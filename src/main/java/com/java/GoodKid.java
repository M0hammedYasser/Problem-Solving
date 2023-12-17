package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GoodKid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				int a = scanner.nextInt();
				list.add(a);
			}
			Collections.sort(list);
			int sum = list.get(0)+1;
			for (int j = 1; j < list.size(); j++) {
				sum*=list.get(j);
			}
			System.out.println(sum);
		}

	}

}
