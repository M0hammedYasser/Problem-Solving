package com.java;

import java.util.Scanner;

public class PolycarpAndTheDayOfPi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final String PI = "314159265358979323846264338327";
		int t = input.nextInt();
		

		for (int i = 0; i < t; i++) {
			String n = input.next();
			int count = 0;
			for (int j = 0; j < n.length(); j++) {
				if (n.charAt(j) == PI.charAt(j)) count++;
				else break;	
				
			}
			System.out.println(count);
		}
		

	}

}
