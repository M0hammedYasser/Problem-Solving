package com.java;

import java.util.Scanner;

public class HowMuchDoesDaytonaCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			
			int n = input.nextInt();
			int k = input.nextInt();
			boolean b = false;
			for (int j = 0; j < n; j++) {
				int a = input.nextInt();
				if (a == k) {
					b = true;
				}
			}
			
			System.out.println(b ? "YES" : "NO");
		}

	}

}
