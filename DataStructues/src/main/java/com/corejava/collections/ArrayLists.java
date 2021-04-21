package com.corejava.collections;

import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
				
		ArrayList<String>  ar= new ArrayList<String>();
		ar.add("Mango");
		ar.add("Guava");
		ar.add("Apple");
		ar.add("bannana");
		ar.add("wood apple");
		System.out.print(" Before Modify Original values"+ar);
		ar.remove(0);
		System.out.print("\nRemove 0th Element"+ar);
		ar.remove("Apple");
		
		System.out.print("\n get value "+ar.get(2));
		System.out.print(" \nFinal List"+ar);
		
	}

}
