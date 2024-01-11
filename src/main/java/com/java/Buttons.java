package com.java;

import java.util.Scanner;

public class Buttons {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();

			System.out.println(a > b ? "First" : (a < b) ? "Second" : ((c % 2 == 0) ? "Second" : "First"));

		}
	}
}