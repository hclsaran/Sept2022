package com.saran.inner;

/*
 * 
 * 
 */

public class Outer {
	private int x=12;
	
	 class Inner{
		   void show() {
			    System.out.println("Data of the outer class "+x);
		   }
	 }
	 public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner outin=out.new Inner();
		outin.show();
	}
	
	

}
