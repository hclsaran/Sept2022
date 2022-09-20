package com.saran.oops;

public class GenericStatic {
	
	int id;
	String name;
	static String address="Guest House Address";
	/*
	 * You are all staying on HCL Guest House( 15 students)
	 */

	
	{
		System.out.println("1");  //instance block
	}

	public GenericStatic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void show() {
		System.out.println(id+"  "+name+" "+address);
	}

	static {
		System.out.println("2");   //static block
	}
	{
		System.out.println("3");   //instance block
	}

	public static void main(String[] args) {
		//new GenericStatic();
		System.out.println("4");
		GenericStatic g1=new GenericStatic(1,"Iqra");
		GenericStatic g2=new GenericStatic(2,"Gonsalez");
		g1.show();g2.show();
		
		
		
	}

}
