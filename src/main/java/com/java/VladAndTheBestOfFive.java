package com.java;

import java.util.Scanner;

public class VladAndTheBestOfFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String str = input.next();
			System.out.println(mostFrequently(str) ? "A" : "B");
		}
	}

	private static boolean mostFrequently(String str) {
		int numOfA = 0;
		for (Character c : str.toCharArray()) {
			if (c == 'A') {
				numOfA++;
			}
		}
		return numOfA > str.length() / 2;
	}

}
