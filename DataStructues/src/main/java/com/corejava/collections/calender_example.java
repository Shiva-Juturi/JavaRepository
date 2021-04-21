package com.corejava.collections;

import java.util.Calendar;

public class calender_example {
	
	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		long mon = cal.get(Calendar.MONTH);
		int day =cal.get(Calendar.DATE);
		long yy =cal.get(Calendar.YEAR);
		System.out.println("Month "	+ ""+mon);
		System.out.println("Day "+day);
		System.out.println("Year "+yy);
		
		System.out.println("Hours  calc ");
	int h =cal.get(Calendar.HOUR);
	int mi =cal.get(Calendar.MINUTE);
	int sec =cal.get(Calendar.SECOND);
	int am= cal.get(Calendar.AM_PM);
	System.out.println("  Hours "+h);
	System.out.println(" Minutes  "+ mi);
	System.out.println("Seconds "+sec);
	System.out.println("AM or Pm "+ am);
	
				
		
	}

}
