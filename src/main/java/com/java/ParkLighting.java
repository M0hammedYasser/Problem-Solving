package com.java;

import java.util.Scanner;

public class ParkLighting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int size = n * m;
			if (size % 2 == 0)
				System.out.println(size/2);
			else
				System.out.println((size/2)+1);
		}

	}

}
