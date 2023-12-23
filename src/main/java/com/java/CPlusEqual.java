package com.java;

import java.util.Scanner;

public class CPlusEqual {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int n = input.nextInt();
			int count = 0;
			inner: while (true) {
				if (a >= b && a <= n) {
					b += a;
					count++;}
				if (b >= a && b <= n) {
					a += b;
					count++;
					}
				else {
					break inner;
				}

			}
			System.out.println(count);
		}

	}

}
