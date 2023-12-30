package com.java;

import java.util.Scanner;

public class Elections {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			long max = Math.max(a, Math.max(b, c));

			if (a == b && a == max) {
				System.out.println(( 1) + " " + ( 1) + " " + ( (max + 1) - c));
				continue;
			}
			if (a == c && c == max) {
				System.out.println(( 1) + " " + ((max + 1) - b) + " " + ( 1));
				continue;
			}
			if (c == b && c == max) {
				System.out.println(((max + 1) - a) + " " + ( 1) + " " + ( 1));
				continue;
			}

			if (a == b && a == c) {
				System.out.println((a + 1) + " " + (b + 1) + " " + (c + 1));
				continue;
			} else {
				if (a == max)
					a = 0;
				else
					a = (max + 1) - a;

				if (b == max)
					b = 0;
				else
					b = (max + 1) - b;

				if (c == max)
					c = 0;
				else
					c = (max + 1) - c;
			}

			System.out.println((a) + " " + (b) + " " + (c));
		}
	}

}
