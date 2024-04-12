package com.java;

import java.util.Scanner;

public class TurtlePuzzleRearrangeAndNegate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int sum = 0;
			for (int j = 0; j < n; j++) {
				int a = input.nextInt();
				sum += Math.abs(a);
			}
			System.out.println(sum);
		}

	}

}
