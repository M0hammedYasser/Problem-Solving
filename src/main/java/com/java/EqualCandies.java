package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EqualCandies {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			List<Integer> list = new ArrayList<Integer>();
			int n = input.nextInt() ,count = 0;
			for (int j = 0; j < n; j++) {
				int a = input.nextInt();
				list.add(a);
			}
			Collections.sort(list);
			
			for(int j = 1 ; j <list.size() ; j++ ) {
				count += list.get(j) - list.get(0);
			}
			System.out.println(count);

		}
	}

}
