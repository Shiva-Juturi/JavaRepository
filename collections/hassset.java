package com.corejava.collections;
import java.util.*;
public class hassset{
	public static void main(String[] args) {
		
HashSet<String> hs =new HashSet<String> ();	
 hs.add("one");
 hs.add("two");
 hs.add("THree");
 hs.add("Four");
 hs.add(null);
 hs.add(null);
 
	System.out.println("Sting "+ hs);
	Iterator<String> it=hs.iterator();
		
	 System.out.println("elements are ");
	  	 while(it.hasNext())
	 {
		String s= (String) it.next();
			System.out.print("    "+s);
	 }
	  	 System.out.println("  \n   one is deleted");
	  	Boolean isr =hs.remove("one");
	  	System.out.println("\n After remove the value "+ hs);
	  	Boolean con =hs.contains(hs);
	  	System.out.println("contains  "+ con);
	  	int size =hs.size();
	  	System.out.println("Size of   "+ size);
	  	Boolean isempty =hs.isEmpty();
	  	System.out.println("IS empty  "+ isempty);
	  	 hs.clear();
	        System.out.println("After clear() => " + hs);
	  	 
			
	}
}