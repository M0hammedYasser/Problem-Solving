package com.java;

import java.util.*;

public class SpyDetected {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int nums = input.nextInt();
			int num, index = -1;
			int count = 0;

			num = input.nextInt();
			int value = num;
			for (int j = 1; j < nums; j++) {
				num = input.nextInt();
				if (value == num) {
					count++;
				} else {
					index = j + 1;
				}
			}
			if (count == 0) {
				System.out.println(1);

			} else
				System.out.println(index);
		}

	}



}
