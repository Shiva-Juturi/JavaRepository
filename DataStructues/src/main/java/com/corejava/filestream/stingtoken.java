package com.corejava.filestream;
import java.util.StringTokenizer;

public class stingtoken {
	
	public static void main(String[] args) {
		
		String name=" this is Sambasiva rao juturi ";
//					StringTokenizer str =new StringTokenizer(name," ");
		
		StringTokenizer str = new  StringTokenizer(name);
		System.out.println(str);
		System.out.println(str.countTokens());
		
		while(str.hasMoreTokens()) {
				String  s =str.nextToken();
				//String s1 =s.trim();
				System.out.print(s);
				System.out.println(str.countTokens());
			
		}
	
	}

}
