package com.java;

import java.util.Scanner;

public class MinimumVariedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			System.out.println(MVN(n));
		}
	}

	private static int MVN(int num) {
		if (num < 10)
			return num;
		if (num < 18)
			return sum(num, "9");
		if (num == 45 ) 
			return 123456789;
		if (num == 44 ) 
			return 23456789;
		if (num == 43 ) 
			return 13456789;
		
		if (num == 42 ) 
			return 3456789;
		if (num == 41 ) 
			return 2456789;
		if (num == 40 ) 
			return 1456789;
		
		if (num == 39 ) 
			return 456789;
		if (num == 38 ) 
			return 356789;
		if (num == 37 ) 
			return 256789;
		if (num == 36 ) 
			return 156789;
		
		
		if (num == 35 ) 
			return 56789;
		if (num == 34 ) 
			return 46789;
		if (num == 33 ) 
			return 36789;
		if (num == 32 ) 
			return 26789;
		if (num == 31 ) 
			return 16789;
		
		if (num == 30 ) 
			return 6789;
		if (num == 29 ) 
			return 5789;
		if (num == 28 ) 
			return 4789;
		if (num == 27 ) 
			return 3789;
		if (num == 26 ) 
			return 2789;
		if (num == 25 ) 
			return 1789;
		if (num == 24 ) 
			return 789;
		if (num == 23 ) 
			return 689;
		if (num == 22 ) 
			return 589;
		if (num == 21 ) 
			return 489;
		if (num == 20 ) 
			return 389;
		if (num == 19 ) 
			return 289;
		if (num == 18 ) 
			return 189;
		return -1;
	
	}

	private static int sum(int num, String s) {
		String string = String.valueOf(String.valueOf(num + s.length()).charAt(1)).concat(s.trim());
		return Integer.parseInt(string);
	}

}
