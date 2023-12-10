package com.java;

import java.util.Scanner;

public class CardsForFriends {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int w = input.nextInt();
			int h = input.nextInt();
			long n = input.nextLong();
			long count = 1;
			while (w % 2 == 0) {
				w /= 2;
				count *= 2;	
			}
			while (h % 2 == 0) {
				h /= 2;
				count *= 2;

			}
			System.out.println(count);

		}

	}

}
