package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SashaAndArrayColoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int max = 0, min = 0;
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}
			Collections.sort(list);

			for (int j = 0; j < list.size() / 2; j++) {
				min += list.get(j);
			}
			if (n % 2 == 0) {
				for (int j = list.size() - 1; j >= list.size() / 2; j--) {
					max += list.get(j);
				}
			} else {
				for (int j = list.size() - 1; j > list.size() / 2; j--) {
					max += list.get(j);
				}
			}

			System.out.println(max - min);

		}

	}

}
