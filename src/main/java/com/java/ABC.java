package com.java;

import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();

			System.out.println( (n == 1 || (n == 2 && s.contains("0") && s.contains("1")) ) ?  "YES": "NO");

		}
	}

}
