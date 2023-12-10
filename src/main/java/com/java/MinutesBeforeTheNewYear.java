package com.java;

import java.util.Scanner;

public class MinutesBeforeTheNewYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		
		for (int i = 0; i < test; i++) {
			int h = input.nextInt();
			int m = input.nextInt();
			
			System.out.println((60-m)+((23-h)*60));
		}

	}

}
