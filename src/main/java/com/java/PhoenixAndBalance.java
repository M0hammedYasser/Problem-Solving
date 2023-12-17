package com.java;

import java.util.Scanner;

public class PhoenixAndBalance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int sumF=0,sumL = 0;
			for (int j = 1; j <= (n/2-1); j++) {
				sumF+=(int)Math.pow(2, j);
			}
			for (int j = (n/2-1)+1; j <n ; j++) {
				sumL+=(int)Math.pow(2, j);
			}
	
			System.out.println((int)Math.pow(2, n)+sumF-sumL);
		}
		scanner.close();

	}

}

 