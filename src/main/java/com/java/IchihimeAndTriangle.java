package com.java;

import java.util.Scanner;

public class IchihimeAndTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			long d = input.nextLong();

			System.out.println(b + " " + c + " " + c);

		}
	}

}
