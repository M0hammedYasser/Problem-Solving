package com.java;

import java.util.Scanner;

public class MaximumInTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[][] array= new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] =1;
			}
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				array[i][j] =array[i-1][j] +array[i][j-1];
			}
		}
		System.out.println(array[n-1][n-1]);
		

	}

}
