package com.java;

import java.util.Scanner;

public class MahmoudAndEhabAndTheEvenOddGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num %2 == 0) System.out.println("Mahmoud");
		else System.out.println("Ehab");

	}

}
