package com.java;

import java.util.Scanner;

public class ColorfulStones {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s = input.next();
		String t = input.next();
		int count = 1;
		int j = 0;

		for (int i = 0; i < t.length(); i++) {
			if (s.charAt(j) == t.charAt(i)) {
				count++;
				j++;
			}
		}
		System.out.println(count);

	}

}
