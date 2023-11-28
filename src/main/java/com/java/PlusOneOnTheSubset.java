package com.java;

import java.util.Scanner;

public class PlusOneOnTheSubset {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int max = 0, min = 1000000000;
			int testCases = input.nextInt();
			for (int j = 0; j < testCases; j++) {
				int n = input.nextInt();
				if (n > max) max = n;
				if (n < min) min = n;
			}
			System.out.println(max-min);
		}
		input.close();
	}

}
