package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemovePrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}
			Set<Integer> set = new HashSet<>();
			int result = 0;
			for (int j = n - 1; j >= 0; j--) {
				if (set.contains(list.get(j))) {
					result = j + 1;
					break;
				}
				set.add(list.get(j));
			}
			System.out.println(result);

		}

	}

}
