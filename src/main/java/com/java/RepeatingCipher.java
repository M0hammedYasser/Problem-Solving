package com.java;

import java.util.Scanner;

public class RepeatingCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s = input.next();
		int j = 0;
		for (int i = 1; i <= n; i += j) {
			System.out.print(s.charAt(i - 1));
			j++;
		}
		System.out.println();
	}

}
