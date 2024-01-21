package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StoneGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}

			System.out.println(solution(indexMax(list), indexMin(list), list));

		}

	}

	private static int solution(int max, int min, List<Integer> list) {
		int n = list.size();
		int mid = (int) Math.ceil((double) list.size() / 2);
		int r1, r2, r3, r4;
		List<Integer> rs = new ArrayList<Integer>();
		r1 = n - max;
		if (min < max) {
			r1 += min + 1;
			rs.add(r1);
		}
		r2 = max + 1;
		if (min > max) {
			r2 += n - min;
			rs.add(r2);
		}
		r3 = max > min ? max + 1 : min + 1;
		rs.add(r3);
		r4 = max > min ? n - min : n - max;
		rs.add(r4);

		return min(rs);

	}

	private static int max(List<Integer> list) {
		List<Integer> integers = new ArrayList<>(list);
		Collections.sort(integers);
		return integers.get(integers.size() - 1);
	}

	private static int min(List<Integer> list) {
		List<Integer> integers = new ArrayList<>(list);
		Collections.sort(integers);
		return integers.get(0);
	}

	private static int indexMax(List<Integer> list) {
		return list.indexOf(max(list));
	}

	private static int indexMin(List<Integer> list) {
		return list.indexOf(min(list));
	}

}
