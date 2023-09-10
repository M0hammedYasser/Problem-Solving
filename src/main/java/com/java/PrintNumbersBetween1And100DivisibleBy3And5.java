package com.java;

public class PrintNumbersBetween1And100DivisibleBy3And5 {
	
	public static void main(String[] args) {
		
		for(int i = 1 ;i<=100;i++) {
			if(i%3==0)
			System.out.print(i+",");
			else {
				continue;
			}
		}
		System.out.println();
		for(int i = 1 ;i<=100;i++) {
			if(i%5==0)
				System.out.print(i+",");
			else {
				continue;
			}
		}
		System.out.println();
		for(int i = 1 ;i<=100;i++) {
			if(i%5==0&&i%3==0)
				System.out.print(i+",");
			else {
				continue;
			}
		}


	}

}
