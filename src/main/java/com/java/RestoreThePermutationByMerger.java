package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestoreThePermutationByMerger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			List<Integer> list = new ArrayList<Integer>();
			int n = input.nextInt();
			for (int j = 0; j < n*2; j++) {
				int a = input.nextInt();
				if (!list.contains(a)) 
					list.add(a);
				
			}
			for (int j = 0; j <list.size(); j++) {
				System.out.println(list.get(j));
			}
			
		}
	}

}
