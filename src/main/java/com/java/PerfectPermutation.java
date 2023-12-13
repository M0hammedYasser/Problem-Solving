package com.java;

import java.util.Scanner;

public class PerfectPermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n <=1 || n %2 != 0 )
			System.out.println(-1);
		else {
			for (int i = 2; i < n+2; i+=2) {
				System.out.println(i);
				System.out.println(i-1);
			}
		}

	}

}
