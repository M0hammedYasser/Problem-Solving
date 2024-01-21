package com.java;

import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long count = 0;
			long n = input.nextLong();
			long result = numCube(n) + numSquare(n) -numSquareAndCube(n);

			System.out.println(result);
		}
	}

	private static long numSquare(long num) {
		return (long) Math.floor(Math.sqrt(num));
	}

	private static long numCube(long num) {
		return (long) Math.floor(Math.cbrt(num));
	}

	private static int numSquareAndCube(long num) {
		int[] arr = { 1, 64, 729, 4096, 15625, 46656, 117649, 262144, 531441, 1000000, 1771561, 2985984, 4826809,
				7529536, 11390625, 16777216, 24137569, 34012224, 47045881, 64000000, 85766121, 113379904, 148035889,
				191102976, 244140625, 308915776, 387420489, 481890304, 594823321, 729000000, 887503681, 1000000000 };
		for (int i = 0; i < arr.length; i++) {
			if (num < arr[i]) {
				return i;
			}
		}
		return 31;
	}

}
