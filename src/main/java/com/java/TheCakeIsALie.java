package com.java;

import java.util.Scanner;

public class TheCakeIsALie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int m = input.nextInt();
			int k = input.nextInt();
			
			int burles = (m - 1)   + (n - 1) * m ;
			System.out.println(burles);
			System.out.println(burles == k ? "YES" : "NO");

		}

	}

}
