package com.java;

import java.util.Scanner;

public class MakeItWhite {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			int last = -1;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'B') {
					last = j;
				}
			}
			System.out.println((last - s.indexOf('B')) + 1);
		}

	}

}
