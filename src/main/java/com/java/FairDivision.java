package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FairDivision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		for (int i = 0; i < test; i++) {

			List<Integer> list = new ArrayList<Integer>();
			int n = input.nextInt();
			int ALice = 0, Bob = 0;
			for (int j = 0; j < n; j++) {
				int a = input.nextInt();
				list.add(a);
			}
			Collections.sort(list, Collections.reverseOrder());
			for (int j = 0; j < list.size(); j++) {
				if (ALice >= Bob) {
					Bob += list.get(j);
				} else {
					ALice += list.get(j);
				}

			}

			if (ALice == Bob)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

}
