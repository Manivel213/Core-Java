package org.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp = new LinkedHashMap<>();
		
		mp.put(10, "Inmakes");
		mp.put(40, "HCL");
		mp.put(10, "CTS");
		mp.put(20, "CTS");
		mp.put(30, "TCS");
		mp.put(60, "GOOGLE");
		mp.put(30, "ACCENTURE");
		mp.put(50, "Accenture");
		
		System.out.println(mp);
		
		Set<Integer> keys = mp.keySet();
		System.out.println(keys);
		
		Collection<String> ent = mp.values();
		System.out.println(ent);
		
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> e : entrySet) {
		Integer key = e.getKey();
		System.out.println(key);
		
		String value = e.getValue();
		System.out.println(value);
		
			
		}
		
		
	}

}
