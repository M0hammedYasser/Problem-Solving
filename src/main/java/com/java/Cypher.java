package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cypher {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Long> list = new ArrayList<Long>();
			List<String> list2 = new ArrayList<String>();
			for (int j = 0; j < n; j++) {
				long a = input.nextLong();
				list.add(a);
			}
			for (int j = 0; j < n; j++) {
				long b = input.nextLong();
				String UD = input.next();
				list2.add(UD);
			}

			for (int j = 0; j < n; j++) {
				long x = list.get(j);
				String s = list2.get(j);
				System.out.print(cypher(x, s) + " ");
			}
			System.out.println();

		}

	}

	public static long cypher(long x, String s) {
		for (int i = 0; i < s.length(); i++) {
			x = (s.charAt(i) == 'U') ? (x = (x == 0) ? 9 : x - 1):(x = (x == 9) ? 0 : x + 1);
		}
		return x;
	}

}
