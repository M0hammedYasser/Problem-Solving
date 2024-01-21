package com.java;

import java.util.Scanner;

public class Rook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String s = input.next();
			char c = s.charAt(0);
			int num = Integer.valueOf(String.valueOf(s.charAt(1)));
			char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
			for (int j = 0; j < 8; j++) {
				if (chars[j] != c) {
					System.out.println((chars[j] + "" + num));
				}
			}
			for (int j = 1; j <= 8; j++) {
				if (j != num) {
					System.out.println((c + "" + j));
				}
			}
			

		}
	}

}
