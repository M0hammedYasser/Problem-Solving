package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Triple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>(n);
			for (int j = 0; j < n; j++) {
				int a = scanner.nextInt();
				list.add(a);
			}
			System.out.println(Trip(list));
		}
	}
	
	public static int Trip(List<Integer> list) {
		if(list.size() < 2 || list.size() >=200000) return -1 ;
		Collections.sort(list);
		for (int i = 0; i < list.size()-2; i++) {
			if(list.get(i) == list.get(i+1) &&list.get(i) == list.get(i+2))
				return list.get(i);
		}
		return -1;
		
	}

}
