package com.java;

import java.util.Scanner;

public class ArrayWithOddSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int sum = 0;
			boolean b = false , c = false;
			for (int j = 0; j < n; j++) {
				int a = scanner.nextInt();
				if (a % 2 == 0)
					b = true;
				else c = true;
				sum += a;
			}
			if (sum % 2 != 0)
				System.out.println("YES" );
			else {
				if (n == 2)
					System.out.println("NO" );
				else if(b&&c)
					System.out.println("YES");
				else {
					System.out.println("NO" );
				}}
		}

	}

}
