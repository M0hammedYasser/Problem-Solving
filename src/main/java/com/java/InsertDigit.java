package com.java;

import java.util.Scanner;

public class InsertDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			long d = input.nextLong();
			String digits = input.next();
			if (index(digits, d) == -1)
				System.out.println(digits.concat(String.valueOf(d)));
			else if (index(digits, d) == 0)
				System.out.println(String.valueOf(d).concat(digits));
			
			else {
				System.out.println(digits.substring(0,index(digits, d))
						.concat(String.valueOf(d)).
						concat(digits.substring(index(digits, d))));
				
			}
		}
	}
	private static int index(String digits, long d) {
		for (int i = 0; i < digits.length() - 1; i++)
			if (Integer.valueOf(String.valueOf(digits.charAt(i))) < d	) {
				return i;
			}
		return -1;
	}

}
