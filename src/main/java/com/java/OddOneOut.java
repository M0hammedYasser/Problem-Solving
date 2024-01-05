package com.java;

import java.util.Scanner;

public class OddOneOut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			System.out.println(differentValue(a, b, c));
		}

	}

	public static long differentValue(long a, long b, long c) {
		if (a == b)
			return c;
		else if (a == c)
			return b;
		else
			return a;

	}

}
