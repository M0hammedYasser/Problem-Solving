package com.java;

import java.util.Scanner;

public class PrintAPedestalCodeforceslogo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int h2, h1, h3;
			if (n % 3 == 0) {
				h2 = n / 3;
				h1 = (n / 3) + 1;
				h3 = (n / 3) - 1;
			} else if (n % 3 == 1) {
				h1 = ((n - 1) / 3) + 2;
				h3 = (n - h1) / 2;
				h2 = n - (h1 + h3);

			} else {
				h1 = ((n + 1) / 3) + 1;
				h3 = (n - h1) / 2 - 1;
				h2 = n - (h1 + h3);
			}
			System.out.println(h2 + " " + h1 + " " + h3);

		}

	}

}
