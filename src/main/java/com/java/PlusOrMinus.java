package com.java;

import java.util.Scanner;

public class PlusOrMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if (a + b == c)
				System.out.println("+");
			if (a - b == c)
				System.out.println("-");
		}
		input.close();
	}

}
