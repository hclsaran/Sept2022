package com.saran.oops;

public class Second {
	int id;
	String name;

	void insertRecords(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	void show() {
		System.out.println(id+"  "+name);
	}
	public static void main(String[] args) {
		Second s1 = new Second();
		Second s2 = new Second();
		s1.id = 10;
		s1.name = "Jethan";
		s2.id = 11;
		s2.name = "Adam";
        s1.insertRecords(12, "Iqra");
        s2.insertRecords(13, "Amar");
        
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
		s1.show();s2.show();

	}
}
