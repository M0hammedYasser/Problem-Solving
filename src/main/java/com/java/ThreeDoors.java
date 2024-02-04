package com.java;

import java.util.Scanner;

public class ThreeDoors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int x = input.nextInt();
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			System.out.println(open(a, b, c, x) ? "YES" : "NO");
		}

	}
	private static boolean open(int a, int b, int c, int x) {
		if ((x == 1 && a == 0) || (x == 2 && b == 0)
				|| (x == 3 && c == 0) || (a == 1 || b == 2 || c == 3))
			return false;
		return true;
	}

}
