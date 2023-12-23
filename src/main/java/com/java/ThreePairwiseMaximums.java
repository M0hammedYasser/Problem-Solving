package com.java;

import java.util.Scanner;

public class ThreePairwiseMaximums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long a, b, c;
			long x = scanner.nextLong();
			long y = scanner.nextLong();
			long z = scanner.nextLong();
			if ((x == y && x >= z) || (x == z && x >= y) || (y == z && y >= x)) {
				System.out.println("YES");
				a = Math.max(x, Math.max(y, z));
				b = Math.min(x, Math.min(y, z));
				if (b > 1)
					c = b - 1;
				else c = b;
				System.out.println(a + " " + b + " " + c);
			} else
				System.out.println("NO");

		}

	}

}
