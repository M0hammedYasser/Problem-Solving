package com.java;

import java.util.Scanner;

public class RoundDownThePrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			String n = input.next();
			char c =Character.forDigit(Integer.parseInt(String.valueOf(n.charAt(0))) -1, 16) ;
			
			System.out.println(Integer.valueOf(n.replaceAll("^.",String.valueOf(c))));
		}

	}

}
