package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			List<String> list = new ArrayList<String>();
			int length = input.nextInt();
			for (int j = 0; j < length; j++) {
				String n = input.next();
				list.add(n);
			}
		
			if (isRepeat(list))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

	public static boolean isRepeat(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) .equals( list.get(j)))
					if (i != j)
						return false;
					else
						continue;
			}

		}
		return true;
	}

}

/*
 * if (arr) System.out.println("YES"); else System.out.println("NO");
 */
