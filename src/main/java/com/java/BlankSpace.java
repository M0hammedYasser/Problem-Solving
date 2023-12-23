package com.java;

import java.util.Scanner;

public class BlankSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int count = 0, max = 0;
			for (int j = 0; j < n; j++) {
				int a = input.nextInt();
				if (a == 0) {
					count++;
					if (max < count)
						max = count;
				} else {
					if (max < count)
						max = count;
					count = 0;
				}

			}
			System.out.println(max);
		}

	}

}
