package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCMProblem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			long l = scanner.nextLong();
			long r = scanner.nextLong();
			List<Long> list = mcl(l, r);
			
			
			
			if(list.size()==2) {
				System.out.print(list.get(0) + " ");
				System.out.println(list.get(1));
			}
			else {
				System.out.print(-1+ " ");
				System.out.println(-1);
			}
			
		}
	}
	
	public static List<Long> mcl(long l , long r) {
		List<Long> list = new ArrayList<Long>();
		for (long i = l; i <= r; i++) {
			for (long j = l; j <=r; j+=i) {
				if (lcm(i, j) >=l && lcm(i, j) <=r && i!=j ) {
					list.add(i);
					list.add(j);
					break;
				}
			}
			return list;
		}
		return null;
		
	}
	
	
	
	public static long lcm(long num1 , long num2) {
		long lcm = (num1 * num2) / gcd(num1, num2);
		    return lcm;
	}
	private static long gcd(long num1, long num2) {
	    if (num2 == 0) {
	        return num1;
	    }
	    return gcd(num2, num1 % num2);
	}

}
