package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeEqual {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Long> list = new ArrayList<>();
			long sum = 0 ;
			for (int j = 0; j < n; j++) {
				long a = input.nextLong();
				list.add(a);
				sum+=a;
			}
			long avg = sum/n;
			System.out.println(soloution(list, avg) ? "YES" : "NO");
			
		}

	}
	
	private static boolean soloution(List<Long> list , long avg) {
		int counter = 0 ;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= avg) {
				counter += list.get(i) -avg ; 
			}
			else {
				if (list.get(i) + counter >= avg  ) {
					counter -= avg-list.get(i);
				}
				else {
					return false;
				}
				
			}
		}
		return true;
	}

}
