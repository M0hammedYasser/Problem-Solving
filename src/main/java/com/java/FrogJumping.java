package com.java;

import java.util.Scanner;

public class FrogJumping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long k = input.nextLong();
			System.out.println((k - (k / 2)) * a - (k / 2) * b);
		}

	}

}
