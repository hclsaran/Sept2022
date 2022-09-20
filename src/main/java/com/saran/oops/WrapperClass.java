package com.saran.oops;

/*
 * Wrapper class provides the mechanism to convert primitive to java object
 * Autoboxing and Unboxing
 */

class CustomWrapperClass{
	private int y;
	CustomWrapperClass(int y){
		this.y=y;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "CustomWrapperClass [y=" + y + "]";
	}
	public static void main(String[] args) {
		CustomWrapperClass cc=new CustomWrapperClass(25);
		System.out.println(cc);
		
	}
	
}

public class WrapperClass {
	
	public static void main(String[] args) {
		
		int x=12;
		Integer i=Integer.valueOf(x); // converting into into Integer
		Integer i1=x; //autoboxing
		
		System.out.println(i);
		System.out.println(i1);
		
		Integer i3=new Integer(4);
		int i4=i3.intValue();//convert an integer to int explicitly
		int i5=i3; //unboxing
		
		
		
	}

}
