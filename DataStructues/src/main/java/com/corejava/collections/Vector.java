package com.corejava.collections;

import java.util.ListIterator;

public class Vector {
	public static void main(String[] args) {
		
		
		java.util.Vector<Integer> vt =new  java.util.Vector<Integer>();
		int [] arr= {10,20,30,40,50,60,70,80};
	
		for (int i = 0; i < arr.length; i++) {
			 vt.add(arr[i]);
			
		}
		System.out.println("Elements in vector"+ vt);
		for (int i = 0; i < vt.size(); i++) {
			
			System.out.println("auto boxing "+vt.get(i));
		}
			
		ListIterator lis =vt.listIterator();
		System.out.println("Forwared direction of list Iterator");
		while(lis.hasNext()) {
						System.out.print("   "+lis.next());
		}
		System.out.println("\n reverse direction of list Iterator");
		while(lis.hasPrevious())
		{
			System.out.print("   "+lis.previous());
		}
	}

}
