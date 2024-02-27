package com.java;

import java.util.Scanner;

public class YesYes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String s = input.next();
			boolean b = true;

			System.out.println(soloution(s) ? "YES" : "NO");
		}

	}

	private static boolean soloution(String s) {
		String y = "esYes";
		if (s.length() == 1) {
			if (!(y.contains(String.valueOf(s.charAt(0))))) {
				return false;
			}
		}
		for (int j = 0; j < s.length() - 1; j++) {
			if (!(y.contains(String.valueOf(s.charAt(j) + "" + s.charAt(j + 1))))) {
				return false;
			}
		}
		return true;
	}

}
