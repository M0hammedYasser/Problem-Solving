package com.java;

import java.util.Scanner;

public class RequiredRemainder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();

		for (int i = 0; i < testCases; i++) {

			int x = input.nextInt();
			int y = input.nextInt();
			int n = input.nextInt(); // 187
			int k = n % x; // 7

			if (n % x == y)
				System.out.println(n);
			else if (n < x && y == 0)
				System.out.println(0);
			else if (n - (k - y) < n)
				System.out.println(n - (k - y));
			else
				System.out.println(n - (k - y) - x);

		}

		input.close();

	}

}
