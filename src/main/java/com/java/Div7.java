package com.java;

import java.util.Scanner;

public class Div7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			if (n % 7 == 0) {
				System.out.println(n);
				continue;
			}
			n = name(n);
			for (int j = n; j < 1000; j++) {
				if (j % 7 == 0) {
					System.out.println(j);
					break;

				}
			}
		}

	}

	public static int name(int num) {
		String s = String.valueOf(num);
		StringBuilder builder = new StringBuilder(s);
		builder.replace(builder.length()-1, builder.length(), "0");

		return Integer.parseInt(builder.toString());
	}


}
