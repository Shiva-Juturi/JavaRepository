package com.corejava.filestream;
import java.util.StringTokenizer;

public class stingtoken {
	
	public static void main(String[] args) {
		
		String name=" this is Sambasiva rao juturi ";
					StringTokenizer str =new StringTokenizer(name," ");
		while(str.hasMoreTokens()) {
				String  s =str.nextToken();
				//String s1 =s.trim();
				System.out.print(s);
		}
	}

}
