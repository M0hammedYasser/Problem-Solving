package com.java;

import java.util.Scanner;

public class AntonAndDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k2 = input.nextInt();
		int k3 = input.nextInt();
		int k5 = input.nextInt();
		int k6 = input.nextInt();
		int max = Math.min(k2, Math.min(k5, k6));
		k2 -= max;
		int min = Math.min(k2, k3);
		System.out.println(max * 256 + min * 32);

	}

}
