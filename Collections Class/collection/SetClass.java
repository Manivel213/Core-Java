package org.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();
		
		s.add(10);
		s.add(50);
		s.add(20);
		s.add(10);
		s.add(70);
		s.add(20);
		s.add(90);
		s.add(10);
		System.out.println(s);
		
		s.remove(90);
		System.out.println("Set 1 : " + s);
		
		Set<Integer> s1 = new TreeSet<>();
		
		s1.add(10);
		s1.add(50);
		System.out.println("set 2 : " + s1);
		
		boolean equals = s1.equals(s);
		System.out.println(equals);
		
		
	}

}
