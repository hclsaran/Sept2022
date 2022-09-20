package com.saran.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	/*unique elements
	 *retrieval will be faster 
	 * doent allow null values
	 * maintaining ascending order
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<>();
		set.add("4");set.add("5");
		set.add("3");set.add("1");set.add("5");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator<String> itr2=set.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
	}
}
