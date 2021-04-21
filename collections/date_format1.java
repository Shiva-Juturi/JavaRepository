package com.corejava.collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_format1 {
	public static void main(String[] args)throws Exception {
		
		String dat2="30/10/2018";  //format need to same
		String pattren1="dd/MM/yyyy";  //format need to same 
		
		//String dateInString = "22-1-2015 10:15:55 AM";
		//private static final String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
		Date sdf =new SimpleDateFormat(pattren1).parse(dat2);
	 String  nd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss  a").format(sdf);
			 System.out.println(nd);
		/*
		 String sDate1="31/12/1998";  
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    System.out.println(sDate1+"\t"+date1);
		    
		     // String -> Date
    		SimpleDateFormat.parse(String);

    		// Date -> String
    		SimpleDateFormat.format(date);
		
		*/
	}

}
