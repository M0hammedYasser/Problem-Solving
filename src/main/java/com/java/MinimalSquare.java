package com.java;

import java.util.Scanner;

public class MinimalSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int min = Math.min(a, b);
			int max = Math.max(a, b);

			if (min * 2 >= max)
				System.out.println((int) Math.pow(min, 2) * 4);

			else
				System.out.println((int) Math.pow(max, 2) );

		}
	}
}
