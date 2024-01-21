package com.java;

import java.util.Scanner;

public class WhoIsOpposite {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			long n = Math.abs(a - b) * 2;
			long ans = 0;
			ans = (a > n || b > n || c > n) ? -1 : c + n / 2;
			ans = (ans > n) ? c - n / 2 : ans;
			System.out.println(ans);
		}

	}

}
