package com.saran.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ListImplTest {
	
	/*
	 * ArrayList features add dynamically
	 *   retreive 
	 *   store in ordered collection
	 *  can contain duplicate values
	 */
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Adam");
		list.add("Sterling");
		list.add("Adam");
		list.add("Veronica");
		list.add("Amar");
		
		System.out.println(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> list2=new LinkedList<>();
		list2.add("Adam");
		list2.add("Sterling");
		list2.add("Adam");
		list2.add("Veronica");
		list2.add("Amar");
		
		System.out.println(list2);
		Iterator<String> itr1=list2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		//LIFO
		Stack<String> stack=new Stack<>();
		stack.push("Jethon");
		stack.push("Adam");
		stack.push("Veronica");
		stack.push("Iqra");
		
		
		Iterator<String> itr3=stack.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		
		}
		
		
	}

	}
