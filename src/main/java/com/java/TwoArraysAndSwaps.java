package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoArraysAndSwaps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			
			int size = input.nextInt();
			int k = input.nextInt();
			List<Integer> list1 = new ArrayList<Integer>(size);
			List<Integer> list2 = new ArrayList<Integer>(size);
			for (int j = 0; j < size; j++)
				list1.add(input.nextInt());
			for (int j = 0; j < size; j++)
				list2.add(input.nextInt());
			for (int j = 0; j < k; j++) {
				Collections.sort(list1);
				Collections.sort(list2);
				int maxIndex = list2.get(list2.size()-1 );
				if (list1.get(0) < list2.get(list2.size()-1)) {
					list1.remove(0);
					list1.add(maxIndex);
					list2.remove(list2.size()-1);
				}
			}
			System.out.println(sumArray(list1));
		}

		input.close();
	}
	private static int sumArray(List<Integer> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			count += list.get(i);
		}
		return count;

	}
}
