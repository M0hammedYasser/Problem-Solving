package com.java;

import java.util.Scanner;

public class StrangeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int m = input.nextInt();
			long x = input.nextLong();
			long nIndex = x % n == 0 ? n : x % n;
			long mIndex = x % n == 0 ? (x + (x % n)) / n : (x + n - (x % n)) / n;

			System.out.println(mIndex + m * (nIndex - 1));

		}

	}

}
