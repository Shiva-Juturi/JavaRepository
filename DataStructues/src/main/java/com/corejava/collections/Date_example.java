package com.corejava.collections;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Date_example {
	public static void main(String[] args) {

		Date d = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, Locale.UK);
		String str = df.format(d);
		System.out.println(" date Format ====  " + str);
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ENGLISH);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
		//DateFormat df4 = DateFormat.getDateInstance(DateFormat.AM_PM_FIELD);
		String st1 = df1.format(d);
		String st2 = df2.format(d);
		String st3 = df3.format(d);
	//	String st4 = df4.format(d);
		System.out.println("STR   ===  " + str);
		System.out.println("DateFormat.MEDIUM  " + st1);
		System.out.println("DateFormat.FULL    " + st2);
		System.out.println("DateFormat.LONG    " + st3);
		//
		//System.out.println("DateFormat.AM_PM_FIELD" + st4);

	}

}
