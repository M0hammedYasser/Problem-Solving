package com.java;

import java.util.Scanner;

public class MediumNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test, a, b, c;
		test = input.nextInt();

		for (int i = 0; i < test; i++) {
			a = input.nextInt();//1
			b = input.nextInt();//2
			c = input.nextInt();//3
			int medium = (a+b+c) 
					- (Math.max(a,Math.max(b, c)))
					- (Math.min(a,Math.min(b, c)));
			System.out.println(medium);
		}
		input.close();

	}

}
