package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeletionsOfTwoAdjacentLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String a = input.next();
			char c = input.next().charAt(0);
			List<Integer> index = new ArrayList<>();
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == c) {
					index.add(j);
				}
			}
			boolean b = false;
			for (int j = 0; j < index.size(); j++) {
				if (index.get(j) % 2 == 0) {
					b = true;
				}

			}

			System.out.println(b ? "YES" : "NO");

		}

	}

}
