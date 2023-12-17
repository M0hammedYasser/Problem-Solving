package com.java;

import java.util.Scanner;

public class GrabTheCandies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int Mihai = 0, Bianca = 0;
			for (int j = 0; j < n; j++) {
				int a = scanner.nextInt();
				if (a % 2 == 0)
					Mihai += a;
				else
					Bianca += a;

			}
			if (Bianca >= Mihai)
				System.out.println("NO");
			else
				System.out.println("YES");

		}

	}

}
