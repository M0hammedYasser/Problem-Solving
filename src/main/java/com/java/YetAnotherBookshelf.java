package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YetAnotherBookshelf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++)
				list.add(input.nextInt());
			int count = 0;
			for (int j = firstOne(list)+1; j < lastOne(list); j++) {
				if (list.get(j) == 0) 
					count++;
				
			}
			System.out.println(count);
		}

	}

	private static int firstOne(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1)
				return i;
		}
		return 0;
	}

	private static int lastOne(List<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) == 1)
				return i;
		}
		return 0;
	}

}
