package com.java;

import java.util.Scanner;

public class MaximumMultipleSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			System.out.println(n == 3 ? 3 : 2);
		}

	}

}
