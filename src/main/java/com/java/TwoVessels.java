package com.java;

import java.util.Scanner;

public class TwoVessels {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			final int c = input.nextInt();
			if (a == b ) {
				System.out.println(0);
				continue;
				
			}
			int count = 1;

			while (Math.abs(a - b) > 2 * c) {
				count++;
				if (a > b) {
					a -= c;
					b += c;
				} else {
					a += c;
					b -= c;
				}
			}
			System.out.println(count);

		}

	}

}
