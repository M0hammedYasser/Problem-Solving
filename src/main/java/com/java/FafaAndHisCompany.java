package com.java;

import java.util.Scanner;

public class FafaAndHisCompany {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt(), count = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				count++;
		}
		System.out.println(count);

	}

}
