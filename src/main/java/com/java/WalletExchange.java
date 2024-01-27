package com.java;

import java.util.Scanner;

public class WalletExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long sum = a + b;
			System.out.println(sum % 2 == 0 ? "Bob" : "Alice");
		}
	}

}
