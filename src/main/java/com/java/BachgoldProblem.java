package com.java;

import java.util.Scanner;

public class BachgoldProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		if (n % 2 == 0) {
			System.out.print(n / 2 + " ");
			for (int i = 0; i < n / 2; i++) {
				System.out.print(2 + " ");
			}

		} else {
			System.out.println((n - 1) / 2);
			System.out.print(3 + " ");
			for (int i = 1; i < (n - 1) / 2; i++) {
				System.out.print(2 + " ");
			}

		}

	}

}
