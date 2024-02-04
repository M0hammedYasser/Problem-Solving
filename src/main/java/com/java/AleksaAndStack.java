package com.java;

import java.util.Scanner;

public class AleksaAndStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			for (int j =1; j <= n *2 ; j+=2) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
