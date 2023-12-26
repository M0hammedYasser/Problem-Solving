package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumIncrease {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Long a = scanner.nextLong();
			list.add(a);
		}
		int count = 1 ,max=1;
		for (int i = 0; i < n - 1; i++) {
			if (list.get(i) < list.get(i + 1)) {
				count++;
				if (count>max) 
					max= count;}
			else {
				if (count>max) 
					max= count;
				count = 1;
			}

		}
		System.out.println(max);

	}

}
