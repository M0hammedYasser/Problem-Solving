package com.java;

import java.util.Scanner;

public class SquareString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		for (int i = 0; i < test; i++) {
			String m = input.next();

			if (m.length() % 2 != 0) {
				System.out.println("NO");
				continue;
			}

			String f = m.substring(0, (m.length() / 2));
			String l = m.substring((m.length() / 2));
			if (f.equals(l))
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		input.close();
	}

}
