package com.java;

import java.util.Scanner;

public class RecoveringASmallString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int c1 = -1, c2 = -1, c3 = -1;
			if (n <= 28) {
				c1 = 1;
				c2 = 1;
				c3 = n - 2;
			} else if (n > 28 & n <= 53) {
				c1 = 1;
				c3 = 26;
				c2 = n - 27;
			} else {
				c3 = 26;
				c2 = 26;
				c1 = n - 52;
			}

			System.out.print((char) (c1 + 96));
			System.out.print((char) (c2 + 96));
			System.out.println((char) (c3 + 96));

		}

	}

}
