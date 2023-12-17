package com.java;

import java.util.Scanner;

public class MostUnstableArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t=scanner.nextInt();
		for(int i= 0 ; i < t ; i++) {
			long n = scanner.nextLong();
			long m = scanner.nextLong();
			
			if(n==1)
				System.out.println(0);
			else if (n == 2)
				System.out.println(m);
			else
				System.out.println(2*m);
		}

	}

}
