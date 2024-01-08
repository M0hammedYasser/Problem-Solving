package com.java;

import java.util.Scanner;

public class NotQuiteLatinSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < 3; j++) {
				String A = input.next();
				if (A.contains("?")) {
					System.out.println(letter(A));
				}
			}
		}
	}
	
	public static char letter(String s) {
		return 'z';
	}

}
