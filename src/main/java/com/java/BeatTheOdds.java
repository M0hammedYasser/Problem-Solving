package com.java;

import java.util.Scanner;

public class BeatTheOdds {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int odd = 0, even = 0;
			for (int j = 0; j < n; j++) {
				long a = input.nextLong();
				if (a % 2 == 0)
					odd++;
				else 
					even++;
			}
			System.out.println(n-Math.max(even, odd));
		}

	}

}
