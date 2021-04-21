package com.corejava.collections;
import java.io.*;
import java.util.*;

public class wordcount {

	
	 public void readFile() {

	        Scanner scanner = null;
	        try {
	            scanner = new Scanner(new File("F:\\Java\\samba.txt"));
	            
	            //Scanner sc = new Scanner(System.in); 
	        } catch (FileNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        while (scanner.hasNext()) {
	            String word = scanner.next();
	            if (map.containsKey(word)) {
	                map.put(word, map.get(word) + 1);
	            } else {
	                map.put(word, 1);
	            }
	        }

	        List<Map.Entry<String, Integer>> entries = new ArrayList(map.entrySet());

	        for (int i = 0; i < map.size(); i++) {
	            System.out.println(entries.get(entries.size() - i - 1).getKey()
	                    + " " + entries.get(entries.size() - i - 1).getValue());
	        }
	    }
}
