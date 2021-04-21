package com.corejava.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class hashtable1 {
	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Nalini", 30);
		ht.put("Sambasiva rao ", 33);
		ht.put("Karthikeya vishnu", 5);
		ht.put("Shanmukha Srikrishana ", 4);
		System.out.println("HAsh table Contain " + ht);

		System.out.println(ht.contains("Nalini"));
		
		System.out.println(ht.containsKey("Nalini"));
		System.out.println("Entrey Set " + ht.entrySet());
			
		
		Set<String> keys = ht.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key:"+key+"value:"+ht.get(key));
		}
		
		Set<Entry<String,Integer>>  entry = ht.entrySet();
				Iterator<Entry<String,Integer>> itr= entry.iterator();
		while(itr.hasNext()) {
		 Entry<String,Integer> key = itr.next();
		 System.out.println(key.getKey()+""+key.getValue());
		}
	
		
		
	}

}
