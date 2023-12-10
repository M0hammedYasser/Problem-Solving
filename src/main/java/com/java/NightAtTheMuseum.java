package com.java;

import java.util.Scanner;

public class NightAtTheMuseum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String name = input.next();
		int count = 0, index = (int) name.charAt(0);

		for (int i = 0; i < name.length() - 1; i++) {
			int num = ((int) name.charAt(i) - (int) name.charAt(i + 1));
			count += div(num);
		}
		System.out.println(count + div(index - 97));
	}

	public static int div(int num) {
		if (Math.abs(num) <= 13 && Math.abs(num) >= 0)
			return Math.abs(num);
		else
			return 26 - Math.abs(num);
	}

}
