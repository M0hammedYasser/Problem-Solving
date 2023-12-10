package com.java;

import java.util.Scanner;

public class OddSet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int length = input.nextInt();
			int Odd = 0, even = 0;
			for (int j = 0; j < length * 2; j++) {

				int n = input.nextInt();
				if (n % 2 == 0)
					Odd++;
				else
					even++;
			}
			if (even == Odd)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

}
