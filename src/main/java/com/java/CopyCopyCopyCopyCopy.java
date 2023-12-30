package com.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CopyCopyCopyCopyCopy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			Set<Integer>set = new HashSet<Integer>();
			for (int j = 0; j < n; j++) {
				int a = input.nextInt();
				set.add(a);
			}
			System.out.println(set.size());
		}
	}

}