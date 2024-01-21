package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			Set<Integer> xs = new HashSet<>();
			Set<Integer> xy = new HashSet<>();
			for (int j = 0; j < 4; j++) {
				int x = input.nextInt();
				int y = input.nextInt();
				xs.add(x);
				xy.add(y);
			}
			List<Integer> xsl = new ArrayList<Integer>(xs);
			List<Integer> ysl = new ArrayList<Integer>(xy);
			int x = xyd(xsl.get(0), xsl.get(1));
			int y = xyd(ysl.get(0), ysl.get(1));
			System.out.println(x * y);

		}
	}

	private static int xyd(int x1, int x2) {
		if (x1 < 0 && x2 < 0)
			return Math.abs(x1 - x2);
		if (x1 > 0 && x2 > 0)
			return Math.abs(x1 - x2);
		else
			return Math.abs(x1) + Math.abs(x2);

	}

}
