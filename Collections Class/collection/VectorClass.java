package org.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class VectorClass {
	
	public static void main(String[] args) {
		
		List<Integer> l = new Vector<>();
		
		l.add(20);
		l.add(10);
		l.add(40);
		l.add(10);
		l.add(60);
		l.add(20);
		l.add(50);
		l.add(10);
		l.add(30);
		System.out.println(l);
		
		Set<Integer> s = new HashSet<>();
		
		s.addAll(l);
		System.out.println(s);
		
		
	}

}
