package com.corejava.collections;

import java.io.IOException;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args)  throws IOException{
		
		LinkedList <String> ll =new LinkedList<String>();
		ll.add("INDIA");
		ll.add("AP");
		ll.add("Guntur");
		System.out.println("Please add object first  "+ll);
		ll.addFirst("Sambasiva Rao ");
		System.out.println("Please add object last node   " +ll);
		ll.addLast("Nalini");
		System.out.println(" after add filan list    "+ll);
		System.out.println("Size of linked lsit    "+ll.size());
		System.out.println("get of linked  1    "+ll.get(1));
		System.out.println("get the first obj   "+ll.getFirst());
		System.out.println("get last obj     "+ll.getLast());
		System.out.println(ll);
		ll.removeLast();
		System.out.println("Please remove  object first  ");
		ll.removeFirst();
		System.out.println("Filanl LINKEd list size  "+ll);
		ll.add(1," Sambasiva  Juturi");
		System.out.println("added perticular posotion  0th "+ll);
		ll.set(0,"I love INDIA");
		System.out.println("replace value of particulat position   "+ll);
		ll.remove(2);
		System.out.println("After removel   "+ll);
		
		System.out.println(" hi     "+ll.clone());
			
	}
}
