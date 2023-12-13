package com.java;

import java.util.Scanner;

public class AtillasFavoriteProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for (int i = 0; i < test; i++) {
			int n = scanner.nextInt();
			String s = scanner.next();
			int max = 0;
			for (int j = 0; j < s.length(); j++) {
				if ((int) s.charAt(j) - 96 > max) {
					max = (int) s.charAt(j) - 96;
				}
			}
			System.out.println(max);
		}

	}

}
