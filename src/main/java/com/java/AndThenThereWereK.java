package com.java;

import java.util.Scanner;

public class AndThenThereWereK {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long n = input.nextLong();
			System.out.println(nearPower(n)-1 );
		}

	}

	
	public static long nearPower(long num) {
		long i;
		for ( i = 2; i <= num; i *= 2) {
		}
		return i / 2;
	}

}
