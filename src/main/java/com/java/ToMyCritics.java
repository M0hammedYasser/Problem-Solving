package com.java;

import java.util.Scanner;

public class ToMyCritics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {

			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();

			if ((a + b + c) - Math.min(a, Math.min(c, b)) >= 10)
				System.out.println("YES");
			else {
				System.out.println("NO");
			}
		}

	}

}
