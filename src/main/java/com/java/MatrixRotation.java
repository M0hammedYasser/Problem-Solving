package com.java;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int[] is = new int[4];
			is[0] = input.nextInt();
			is[1] = input.nextInt();
			is[2] = input.nextInt();
			is[3] = input.nextInt();
			System.out.println(((is[1] - is[0] > 0 && is[3] - is[2] > 0) || (is[1] - is[0] < 0 && is[3] - is[2] < 0))
					&& ((is[2] - is[0] > 0 && is[3] - is[1] > 0) || (is[2] - is[0] < 0 && is[3] - is[1] < 0)) ? "YES"
							: "NO");
		}

	}
}
