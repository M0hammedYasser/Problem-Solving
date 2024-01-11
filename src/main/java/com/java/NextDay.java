package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextDay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int day = input.nextInt();
			int month = input.nextInt();
			int year = input.nextInt();
			List<Integer> list = tomorrow(day, month, year);
			if (list.size() != 3) {
				System.out.println("invalid Date");
			} else {
				System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
			}

		}

	}

	public static List<Integer> tomorrow(int day, int month, int year) {
		if (month > 12 || month < 1 || day > 31 || day < 1 || year < 1)
			return new ArrayList<Integer>();
		if (day == 31) {
			day = 1;
			if (month == 12) {
				month = 1;
				year++;
			} else
				month++;
		} else if (day == 30 && month != 2) {
			day = 1;
			month++;
		} else if (month == 2 && day == 29) {
			month++;
			day = 1;
		} else if (month == 2 && day == 28) {
			if (year % 4 == 0)
				day++;
			else {
				month++;
				day = 1;
			}
		} else
			day++;

		List<Integer> list = new ArrayList<Integer>();
		list.add(0, day);
		list.add(1, month);
		list.add(2, year);
		return list;
	}

}
