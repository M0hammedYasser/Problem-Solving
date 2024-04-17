package com.java;

import java.util.Scanner;

public class StairPeakOrNeither {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			if (c > b && b > a) 
				System.out.println("STAIR");
			else if (c < b && b > a) 
				System.out.println("PEAK");
			else 
				System.out.println("NONE");
		}
	}

}
