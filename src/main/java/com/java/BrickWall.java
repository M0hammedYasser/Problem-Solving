package com.java;

import java.util.Scanner;

public class BrickWall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n  = input.nextInt();
			int m  = input.nextInt();
			System.out.println(m % 2 == 0  ? n * m / 2 : n * (m-1) / 2);
		}
	}

}
