package com.java;

import java.util.Scanner;

public class FloorNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {

			int n = input.nextInt(); // 7
			int x = input.nextInt(); // 3
			int count = 1;

			if (n == 1 || n == 2) {
				count =1;
			} else {
				n -= 2;

				while (n > 0) {
					n -= x;
					count++;
				}

			}
			System.out.println(count);

		}

	}

}
