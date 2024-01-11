package com.java;

import java.util.Scanner;

public class TwoThreeMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long n = input.nextLong();
			long result = -1;
			if (n == 1)
				result = 2;
			else
				result = n % 3 == 0 ? n / 3 : n % 3 == 2 ? (n + 1) / 3 : (n + 2) / 3;

			System.out.println(result);

		}
	}

}
