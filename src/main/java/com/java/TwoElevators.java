package com.java;

import java.util.Scanner;

public class TwoElevators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int Ta = a;
			int Tb = Math.abs(c - b) + c;

			if (Ta == Tb)
				System.out.println(3);
			else {
				if (Ta < Tb)
					System.out.println(1);
				else
					System.out.println(2);

			}

		}

	}

}
