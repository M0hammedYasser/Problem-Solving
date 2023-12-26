package com.java;

import java.util.Scanner;

public class VusTheCossackAndAContest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		int k = input.nextInt();
		
		if(n <=m && n <=k) System.out.println("YES");
		else System.out.println("NO");

	}

}
