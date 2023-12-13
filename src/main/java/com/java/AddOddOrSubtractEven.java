package com.java;

import java.util.Scanner;

public class AddOddOrSubtractEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();

		for (int i = 0; i < test; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int div = b - a;
			if (div == 0) // 0
				System.out.println(0);
			else if (div > 0) {
				if (div % 2 != 0 && div > 0) // odd and positive
					System.out.println(1);
				else if ((div % 2 == 0 && div > 0)) // even and positive
					System.out.println(2);
			}
			if (div < 0) {

				if (div % 2 != 0 && div < 0) // odd and negative
					System.out.println(2);
				else if ((div % 2 == 0 && div < 0)) // even and negative
					System.out.println(1);

			}
		}

	}

}
