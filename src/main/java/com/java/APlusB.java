package com.java;

import java.util.Scanner;

public class APlusB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String s = input.next();
			System.out.println(Character.getNumericValue(s.charAt(0))+
					Character.getNumericValue(s.charAt(2)));

		}
	}

}
