package com.java;

import java.util.Scanner;

public class ErasingZeroes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String s = input.next();
			System.out.println(minNumberOfO(s));
		}
	}

	private static int minNumberOfO(String s) {
		int count = 0, co = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == '0')
						co++;
					else if (s.charAt(j) == '1') {
						count += co;
						co = 0;
						break;
					}
				}
			}
		}

		return count;
	}
}
