package com.saran.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	
	/*
	 * HashSet follow the principle of hashing
	 * contains unique elements
	 *  allows null values
	 *    doesnt maintain insertion order
	 *    search operations
	 *    default capacity is always 16
	 */
	
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		set.add("1");set.add("2");
		set.add("3");set.add("1");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
