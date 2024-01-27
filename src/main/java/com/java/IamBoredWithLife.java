package com.java;

import java.util.Scanner;

public class IAmBoredWithLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		System.out.println(factorial(Math.min(A, B)));

	}

	private static long factorial(long num) {
		if (num == 1 || num == 0)
			return 1;
		else
			return factorial(num - 1) * num;

	}

}
