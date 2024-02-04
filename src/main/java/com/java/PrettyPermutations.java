package com.java;

import java.util.Scanner;

public class PrettyPermutations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			if (n % 2 == 0) {
				for (int j = 1; j <= n; j += 2)
					System.out.print(j + 1 + " " + j + " ");

			} else {
				System.out.print(3 + " ");
				System.out.print(1 + " ");
				System.out.print(2 + " ");

				for (int k = 4; k <= n; k += 2)
					System.out.print(k + 1 + " " + k + " ");

			}

			System.out.println();
		}

	}

}
