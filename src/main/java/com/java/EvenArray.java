package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int count = 0, c = 0;

		int test = input.nextInt();
		for (int i = 0; i < test; i++) {
			int index = input.nextInt();

			for (int j = 0; j < index; j++) {
				int a = input.nextInt();
				list.add(a);
			}

			for (int j = 0; j < list.size(); j += 2) {
				if (!isEven(list.get(j)))
					count++;
			}
			for (int j = 1; j < list.size(); j += 2) {
				if (isEven(list.get(j)))
					count++;
			}
			for (int j = 0; j < list.size(); j++) {
				if (isEven(list.get(j))) 
					c++;
				else c--;
				
			}
			if (c != 0 && c != 1) {
				System.out.println(-1);
			}

			
			else
				System.out.println(count / 2);

			list.clear();
			count = 0;
			c=0;

		}
		input.close();

	}

	public static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

}

/*
 * if (index == 2) { if (isEven(list.get(0))) System.out.println(0);
 * 
 * else System.out.println(1);
 * 
 * }
 */
