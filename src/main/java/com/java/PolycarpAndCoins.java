package com.java;

import java.util.Scanner;

public class PolycarpAndCoins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			double n = input.nextDouble();
			int vr = (int)Math.round(n/3);
			System.out.println((int)n-(vr*2));
			System.out.println((int)vr);	
		}
		input.close();
	}

}
/*
 *1       *2  
334       333          1000
10        10           30
1         0            1
10        11           32
333333334 333333333    100000000
1         2            2 
 * */
