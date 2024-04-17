package com.java;

import java.util.Scanner;

public class YogurtSale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int priceOne = input.nextInt();
			int priceTwo = input.nextInt();

			if (priceTwo < priceOne * 2) {
				if (n % 2 == 0) 
					System.out.println((n / 2) * priceTwo);
				else 
					System.out.println((((n-1) / 2) * priceTwo) + priceOne);
			}
			else 
				System.out.println(n*priceOne);
		}

	}

}
