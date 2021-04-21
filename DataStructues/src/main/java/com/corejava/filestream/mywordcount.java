package com.corejava.filestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class mywordcount {
	public static void main(String[] args) throws IOException {
		try (FileReader fi = new FileReader("F:\\Java\\samba.txt"); 
				BufferedReader br = new BufferedReader(fi);) 
		{
			HashMap<String, Integer> map = new HashMap<>();
			String ch;
			while ((ch = br.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(ch, " ");
				while (token.hasMoreTokens()) {
					String key = token.nextToken();

					if (map.containsKey(key)) {
						Integer value = map.get(key);
						map.put(key, value + 1);
						System.out.println("map  gekey   " + map.get(key));

					} else {
						map.put(key, 1);
					}
				}
			}

			Set<Entry<String, Integer>> entries = map.entrySet();
			Iterator<Entry<String, Integer>> iter = entries.iterator();
			while (iter.hasNext()) {
				Entry<String, Integer> entry = iter.next();
				System.out.println(entry.getKey() + "-----" + entry.getValue());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
