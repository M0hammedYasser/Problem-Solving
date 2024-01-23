package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftCarpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int m = input.nextInt();
			List<String> strings = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				String s = input.next();
				strings.add(s);
			}

			boolean V = false, I = false, K = false, A = false;
			for (int j = 0; j < m; j++) {
				List<Character> characters = new ArrayList<>();
				for (int k = 0; k < n; k++) {
					characters.add(strings.get(k).charAt(j));
				}

				if (characters.contains('v') && !V)
					V = true;

				else if (characters.contains('i') && V && !I)
					I = true;

				else if (characters.contains('k') && I && !K)
					K = true;

				else if (characters.contains('a') && K && !A)
					A = true;

			}
			System.out.println(V && I && K && A ? "YES" : "NO");
		}

	}

}
