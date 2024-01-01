package com.java;

import java.util.Scanner;

public class FreeIceCream {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		long x = input.nextLong();
		int count = 0;
		for (int i = 0; i < n; i++) {
			String a = input.next();
			long d = input.nextLong();
			if (a.equals("+"))
				x += d;
			else if (a.equals("-") && x >= d)
				x -= d;
			else
				count++;

		}
		System.out.println(x + " " +count);
	}

}
