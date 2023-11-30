package com.java;

import java.util.Scanner;

public class PanoramixsPrediction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();// 3
		int m = input.nextInt();
		n += 1;
		while (!isPrime(n)) {
			n++;
		}
		if (n == m)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static boolean isPrime(int num) {
		if (num <= 1)
			return true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
