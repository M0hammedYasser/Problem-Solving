package com.java;

import java.util.Scanner;

public class SystemOfEquations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		int max = Math.max(n, m);
		int count = 0;
		for (int i = 0; i <= max; i++) {
			for (int j = 0; j <= max; j++) {
				if (i * i + j == n && j * j + i == m) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
