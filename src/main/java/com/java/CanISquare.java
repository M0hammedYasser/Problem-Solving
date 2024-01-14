package com.java;

import java.util.Scanner;

public class CanISquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			long sum = 0;
			for (int j = 0; j < n; j++)
				sum += input.nextLong();

			System.out.println(isSquare(sum) ? "YES" : "NO");

		}

	}

	private static boolean isSquare(long num) {
		if (num <= 0)
			return false;
		else {
			double sqr = (int) Math.sqrt(num);
			return sqr * sqr == num;
		}
	}

}
