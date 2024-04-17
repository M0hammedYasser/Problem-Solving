package com.java;

import java.util.Scanner;

public class ClockConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String time = input.next();
			int hour = Integer.parseInt(time.substring(0, 2));
			if (hour < 12)
				System.out.println(hour == 0 ? "12".concat(time.substring(2).concat(" AM")) : time.concat(" AM"));
			else {
				hour = hour == 12 ? 12 : hour - 12;
				String newHour = String.valueOf(hour);
				newHour = newHour.length() == 1 ? "0".concat(newHour) : newHour;
				System.out.println(newHour.concat(time.substring(2).concat(" PM")));
			}

		}

	}

}
