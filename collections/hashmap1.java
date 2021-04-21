package com.corejava.collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {
	public static void main(String[] args) {
		
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("Sambasiva Rao", "Nalini");
		hm.put("Sambasiva Rao", "Nalini");
		hm.put("karthikeya", "vishnu");
		hm.put("Shanmukha ","Srikrishan");
		hm.put("one","Two");
		hm.put(null,null);
		hm.put(null,null);
		
		System.out.println("First time null value "+hm);
		String s= hm.get("Sambasiva Rao");
		
		System.out.println(s);
				hm.remove("null");
		System.out.println("second  time null value "+hm);
		System.out.println("Contains Key "+hm.containsKey("Sambasiva Rao"));
		System.out.println(" Entry Set_______ "+hm.entrySet());
		
		System.out.println("Key set-------------- "+hm.keySet());
		System.out.println("values    +++++++"+hm.values());
	
				
		
	}

}
