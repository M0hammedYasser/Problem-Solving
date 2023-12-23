package com.java;

import java.util.Scanner;

public class WordOnThePaper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {

			String newS = "";
			for (int j = 0; j < 8; j++) {
				String s = scanner.next();

				for (int k = 0; k < 8; k++) {
					if (s.charAt(k) != '.') {
						newS = newS.concat(String.valueOf(s.charAt(k)));
					}
				}

			}

			System.out.println(newS);
		}

	}

}
