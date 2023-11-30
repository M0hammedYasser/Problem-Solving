package com.java;

import java.util.Scanner;

public class FairPlayoff {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		for (int i = 0; i < test; i++) {
			double s1 = input.nextDouble();
			double s2 = input.nextDouble();
			double s3 = input.nextDouble();
			double s4 = input.nextDouble();

			if (Math.max(s1, s2) > Math.min(s3, s4) 
					&&Math.max(s3, s4) > Math.min(s1, s2) )
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}
