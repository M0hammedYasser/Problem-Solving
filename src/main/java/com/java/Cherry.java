package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cherry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			long result = 0;
			List<Long> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextLong());
			}
			for (int j = 0; j < list.size() - 1; j++) {
				result = Math.max(list.get(j) * list.get(j + 1), result);
			}
			System.out.println(result);

		}

	}

}
