package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FavoriteSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for (int i = 0; i < test; i++) {
			int n = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> list2 = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				int b = scanner.nextInt();
				list.add(b);
			}

			n--;
			for (int j = 0; j <= n; j++) {
				list2.add(list.get(j));
				if (n != j)
					list2.add(list.get(n));
				n--;
			}

			for (int j = 0; j < list2.size(); j++) {
				System.out.println(list2.get(j));
			}

		}

	}
}