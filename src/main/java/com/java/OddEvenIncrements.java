package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenIncrements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}

			boolean b = true;

			if (isSame(list)) {
				System.out.println("YES");
				continue;
			}

			if (list.get(0) % 2 == 0) {
				for (int j = 0; j < n; j += 2) {
					if (list.get(j) % 2 != 0) {
						b = false;
						break;
					}
				}
				for (int j = 1; j < n; j += 2) {
					if (list.get(j) % 2 == 0) {
						b = false;
						break;
					}
				}
			} else {

				for (int j = 0; j < n; j += 2) {
					if (list.get(j) % 2 == 0) {
						b = false;
						break;
					}
				}
				for (int j = 1; j < n; j += 2) {
					if (list.get(j) % 2 != 0) {
						b = false;
						break;
					}
				}
			}

			System.out.println(b ? "YES" : "NO");

		}

	}


	public static boolean isSame(List<Integer> list) {
		if (list.get(0) % 2 == 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) % 2 != 0) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) % 2 == 0) {
					return false;
				}
			}
		}

		return true;
	}
}