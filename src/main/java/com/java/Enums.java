package com.java;

public class Enums {
	
public static void main(String []args) {
	
	
	DaysOfWeek daysOfWeek =  DaysOfWeek.SUNDAY;
	
	System.out.println(daysOfWeek);
	
	
}




	public enum DaysOfWeek {
		SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}
}