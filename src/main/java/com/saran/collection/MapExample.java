package com.saran.collection;

import java.util.HashMap;
import java.util.Map;


public class MapExample {
	
	//Map is not a part of Collection
	//Collection(interface) Collections(class)
	/*Real time use case->Lets say in an orgnaization we have lot of employees
	 * if we want to find the details of employees (i have mulitple brandon names)
	 * with the help of id's(id must be unique) 
	 * Map stores key values pairs
	 * id=121 name=Adam
	 * id=23 name=bradon
	 * Map doesnt allow primitive data types
	 * HashMap does allow one null key and many no of null values
	 */
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(121, "Adam");
		map.put(122, "Jethon");
		map.put(123, "Veronica");
		map.put(124, "Jean");
		map.put(125, "Rebecca");
		
		
		System.out.println(map);//all the key value paris
		System.out.println(map.get(123));//Veronica
		System.out.println(map.containsKey(122));
		System.out.println(map.containsValue("Rebecca"));
		map.put(126, "Benjamin");
		System.out.println(map);
		map.replace(123, "Chris");
		System.out.println(map);
		map.putIfAbsent(126, "Ajay");
		System.out.println(map);
		
		
	}

}