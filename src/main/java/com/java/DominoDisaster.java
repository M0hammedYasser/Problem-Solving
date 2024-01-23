package com.java;

import java.util.Scanner;

public class DominoDisaster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			char[] c = new char[n];
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'U')
					c[j] = 'D';
				else if (s.charAt(j) == 'D')
					c[j] = 'U';
				else
					c[j] = s.charAt(j);
			}
			for (char d : c) {
				System.out.print(d);
			}
			System.out.println();
			

		}
	}

}
