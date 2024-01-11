package com.java;

import java.util.Scanner;

public class GregorAndCryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long P = input.nextLong();
			System.out.println(2 + " " + (P - 1));

		}
	}

}
