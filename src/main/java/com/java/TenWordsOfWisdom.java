package com.java;

import java.util.Scanner;

public class TenWordsOfWisdom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int max = 0, index = -1;
			for (int j = 0; j < n; j++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if (b > max && a <= 10) {
					max = b;
					index = j;
				}

			}
			System.out.println(index + 1);
		}

	}

}
