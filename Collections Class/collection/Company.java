package org.collection;

import java.util.LinkedList;
import java.util.List;

public interface Company {
	
	public static void main(String[] args) {
		
		
		List li = new LinkedList();
		li.add(10);
		li.add("Inmakes Infotech");
		li.add(10);
		li.add(null);
		li.add(1343543l);
		li.add(444.433f);
		li.add(true);
		li.add('@');
		li.add(null);
		li.add("Inmakes Infotech");
		li.add(10);
		
		System.out.println(li);			
	}
}
