package com.java;

import java.util.Scanner;

public class MinMaxSwap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] A = new int[n];
			int[] B = new int[n];
			for (int j = 0; j < n; j++) {
				A[j] = input.nextInt();
			}
			for (int j = 0; j < n; j++) {
				B[j] = input.nextInt();
			}
			for (int j = 0; j < n; j++) {
				if (A[j] < B[j]) {
					int w = A[j];
					A[j] = B[j];
					B[j] = w;
				}
			}
			System.out.println(max(A) * max(B));

		}

	}

	private static int max(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			max = i > max ? i : max;
		}
		return max;

	}
}
