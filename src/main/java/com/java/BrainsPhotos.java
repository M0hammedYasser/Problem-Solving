package com.java;

import java.util.Scanner;

public class BrainsPhotos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		for (int i = 0; i < n * m; i++) {
			char color = input.next().charAt(0);

			if (color == 'C' || color == 'M' || color == 'Y') {
				System.out.println("#Color");
				System.exit(0);
			}
			
		}
		System.out.println("#Black&White");
	}

}
