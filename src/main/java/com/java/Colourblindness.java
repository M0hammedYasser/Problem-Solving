package com.java;

import java.util.Scanner;

public class Colourblindness {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int grid = input.nextInt();
			String s1 = input.next();
			String s2 = input.next();

			if (isSame(s1, s2, grid))
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

	public static boolean isSame(String s1, String s2, int grid) {
		for (int i = 0; i < grid; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (!((s1.charAt(i) == 'G' && s2.charAt(i) == 'B')||
						(s1.charAt(i) == 'B' && s2.charAt(i) == 'G')))
					return false;
	
				

			}
		}
		return true;

	}

}
