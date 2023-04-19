package org.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public interface CompanyDetails {
	public static void main(String[] args) {
		
		List<Integer> listl = new LinkedList<Integer>();
		
		listl.add(10);
		listl.add(20);
		listl.add(30);
			
		System.out.println("List 1 : " + listl);
		
	    List<Integer> list2 = new Vector<>();
		
	    list2.add(400);
	    list2.add(900);
	    
	    list2.addAll(listl);
	    System.out.println("list 2 : " + list2);
	    
	    list2.retainAll(listl);
	    System.out.println("Common Values : " + list2);
	    
	    list2.removeAll(listl);
	    System.out.println("After Removing the common Values : " + list2);
	    
	    
    
	}		
	}
