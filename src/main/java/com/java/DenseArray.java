package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DenseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Double> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextDouble());
			}
			for (int j = 0; j < list.size() - 1; j++) {
				if ((Math.max(list.get(j), list.get(j + 1)) / Math.min(list.get(j), list.get(j + 1)) <= 2)) {
				} else {
					list.add(j + 1,
							(list.get(j) > list.get(j + 1)
									? ((list.get(j) / 2) )
									:  ((list.get(j) * 2) )));

				}
			}
			System.out.println(list.size()-n);

		}
	}

}
