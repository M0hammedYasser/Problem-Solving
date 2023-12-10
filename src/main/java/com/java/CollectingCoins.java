package com.java;

import java.util.Scanner;

public class CollectingCoins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {

			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			int n = input.nextInt();

			int div = (max(a, b, c) - min(a, b, c)) + (max(a, b, c) - mid(a, b, c));

			n -= div;

			if (n >= 0 && n % 3 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static int min(int a, int b, int c) {
		return Math.min(a, Math.min(b, c));
	}

	public static int mid(int a, int b, int c) {
		return sum(a, b, c) - (max(a, b, c) + min(a, b, c));
	}

}
