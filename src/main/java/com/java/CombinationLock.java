package com.java;

import java.util.Scanner;

public class CombinationLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String original = input.next();
		String opens = input.next();
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += open(original.charAt(i), opens.charAt(i));
		}
		System.out.println(count);

	}

	public static int open(int orginal, int open) {
		if (Math.abs(orginal - open) <= 5) {
			return Math.abs(orginal - open);
		} else {
			return 10 - Math.abs(orginal - open);
		}
	}

}
