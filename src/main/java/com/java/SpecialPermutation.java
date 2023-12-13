package com.java;

import java.util.Scanner;

public class SpecialPermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for (int i = 0; i < test; i++) {

			int n = scanner.nextInt();
			if (n % 2 == 0) {
				for (int j = n; j >= 1; j--) {
					System.out.println(j);
				}
			} else {
				System.out.println((n + 1) / 2);
				for (int j = n; j >= 1; j--) {
					if (j == (n + 1) / 2) {
						continue;
					} else
						System.out.println(j);
				}
			}
		}

	}

}
