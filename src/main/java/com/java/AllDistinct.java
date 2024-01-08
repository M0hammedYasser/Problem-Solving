package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AllDistinct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}
			Set<Integer> set = new HashSet<Integer>(list);
			int ans = n - set.size();
			System.out.println(ans % 2 != 0 ? set.size() - 1 : set.size());

		}

	}

}
