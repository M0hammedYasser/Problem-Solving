package com.java;

import java.util.Scanner;

public class VasyaAndCoins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			if (a == 0)
				System.out.println(1);
			else 
				System.out.println(a+(2*b)+1);

		}

	}

}
