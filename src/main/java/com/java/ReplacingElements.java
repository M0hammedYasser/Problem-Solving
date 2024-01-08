package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReplacingElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int d = input.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}
			System.out.println(isOtherwise(list, d) ? "YES" : "NO");
		}
	}

	public static boolean isOtherwise(List<Integer> list, int d) {
		Collections.sort(list);
		if (list.get(0) + list.get(1) <= d || list.get(list.size() - 1) <= d)
			return true;
		return false;

	}

}