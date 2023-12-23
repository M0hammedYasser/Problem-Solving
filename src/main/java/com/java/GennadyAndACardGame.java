package com.java;

import java.util.Scanner;

public class GennadyAndACardGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cardOnTheTable = input.next();
		for (int i = 0; i < 5; i++) {
			String cardOnTheHand = input.next();
			if (cardOnTheTable.charAt(0) == cardOnTheHand.charAt(0)
					||cardOnTheTable.charAt(1) == cardOnTheHand.charAt(1) ) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		

	}

}
