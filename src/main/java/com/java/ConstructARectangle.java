package com.java;

import java.util.Scanner;

public class ConstructARectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int l1 = input.nextInt();
			int l2 = input.nextInt();
			int l3 = input.nextInt();
			
			System.out.println(possible(l1, l2, l3) ? "YES" : "NO");
	
		}
	}

	private static boolean possible(int l1, int l2, int l3) {

		if (max(l1, l2, l3) == min(l1, l2, l3) + mid(l1, l2, l3)) 
			return true;
		
		if ((l1 == l2 && l3 %2==0)||(l1 == l3 && l2 %2==0)||(l3 == l2 && l1 %2==0)) 
			return true;
		
		return false;
		

	}

	private static int max(int l1, int l2, int l3) {
		return Math.max(l1, Math.max(l2, l3));
	}

	private static int min(int l1, int l2, int l3) {
		return Math.min(l1, Math.min(l2, l3));
	}

	private static int sum(int l1, int l2, int l3) {
		return l1 + l2 + l3;
	}

	private static int mid(int l1, int l2, int l3) {
		return sum(l1, l2, l3) - (max(l1, l2, l3) + min(l1, l2, l3));
	}

}
