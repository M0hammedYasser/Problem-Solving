package com.java;

import java.util.Scanner;

public class Reconnaissance2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int[] is = new int[t];
		for (int i = 0; i < t; i++) {
			is[i] = input.nextInt();
		}
		int I1 = 1, I2 = t;
		int min = Math.abs(is[0] - is[t - 1]);
		for (int i = 0; i < is.length - 1; i++) {
			if (Math.abs(is[i] - is[i + 1]) < min) {
				min = Math.abs(is[i] - is[i + 1]);
				I1 = i+1;
				I2 = i+2;
			}

		}
		System.out.println(I1 + " " + I2);
	}

}
