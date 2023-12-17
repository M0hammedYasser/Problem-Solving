package com.java;

import java.util.Scanner;

public class CasimirsStringSolitaire {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			String s = scanner.next();
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'B')
					count++;
			}
			if ((double)count == ((double)s.length() / 2))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
