package com.java;

import java.util.Scanner;

public class LinearKeyboard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String a = input.next();
			String s = input.next();
			int count = 0;
			for (int j = 0; j < s.length() - 1; j++) {
				int pre = Math.abs((a.indexOf(s.charAt(j)) + 1) - (a.indexOf(s.charAt(j + 1)) + 1));
				count += pre;
			}
			System.out.println(count);
		}

	}

}
