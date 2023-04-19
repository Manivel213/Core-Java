package org.collection;

import java.util.LinkedList;
import java.util.List;

public class ListMethod {

	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<Integer>();

		l.add(10);
		l.add(40);
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(10);
		l.add(90);
		l.add(10);
		System.out.println(l);
		int size = l.size();
		System.out.println("size : " + size);

		Integer integer = l.get(5);
		System.out.println("Value : " + integer);

		l.add(4, 200);
		System.out.println("Last Updated List " + l);

		l.set(2, 500);
		System.out.println(l);

		l.remove(2);
		System.out.println("Last removed list : " + l);

		boolean contains = l.contains(20);
		System.out.println(contains);

		boolean empty = l.isEmpty();
		System.out.println(empty);

//l.clear();
//System.out.println(l);

		int first = l.indexOf(10);
		System.out.println("First 10 presented index : " + first);

		int last = l.lastIndexOf(10);
		System.out.println("Last 10 presented index : " + last);

	}

}
