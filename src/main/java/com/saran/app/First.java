package com.saran.app;

public class First {
	
	int x=10;//instance variable
	static int z=30;//static variable
	int x1;
	int y1;
	
	public static void main(String[] args) {
		int y=1; //local variable  must be initialized
		
		First f=new First();
		f.x1=12;
		f.y1=34;
		System.out.println(f.x);
		System.out.println(y);
		System.out.println(First.z);
		System.out.println(z);
		System.out.println(f.x1);
		System.out.println(f.y1);
		
		
		
	}

}
