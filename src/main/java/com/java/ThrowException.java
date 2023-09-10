package com.java;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number");
		int num2 = input.nextInt();
		
		if (num2 ==0)
			throw new ArithmeticException("You Can't divide By 0 ! ");
		System.out.println(num1/num2);

	}

}
