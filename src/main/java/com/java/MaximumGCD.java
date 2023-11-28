package com.java;

import java.util.Scanner;

public class MaximumGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int n = input.nextInt();
			if (n  / 2 == 0)
				System.out.println(1);
			else
				System.out.println(n / 2);
		}

		input.close();

	}

}
