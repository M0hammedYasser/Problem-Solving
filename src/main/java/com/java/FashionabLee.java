package com.java;

import java.util.Scanner;

public class FashionabLee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long n = input.nextLong();
			if(n%4 == 0 ) System.out.println("YES");
			else System.out.println("NO");
		}

	}

}
