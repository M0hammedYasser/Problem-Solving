package com.java;

import java.util.Scanner;

public class VanyaAndCubes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int count = 0, i = 1;

		while (true) {
			count += (i * (i + 1) / 2);
			if (count > num)
				break;
			i++;

		}
		System.out.println(i-1);
		input.close();

	}

}
