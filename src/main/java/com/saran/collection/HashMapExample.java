package com.saran.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapExample {
	
	public static void main(String[] args) {
		List<String> list=new CopyOnWriteArrayList<>();
		list.add("6");
		list.add("7");
		list.add("8");
		Iterator<String> itr1=list.iterator();
		while(itr1.hasNext()) {
			String value=itr1.next();
			System.out.println("listValue"+value);
			if(value.equals("8")) {
				list.remove("6");
				list.add("9");
				list.add("10");
			}
		}
		System.out.println("List values "+list.size());
		
		
		
		Map<String,String> map=new ConcurrentHashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			System.out.println("Map value "+map.get(key));
			if(key.equals("2")) {
				map.put("1", "4");
				//map.put("4", "4");
				map.remove("1");
				
			}
			
		}
		
		System.out.println(map);
	}

}
