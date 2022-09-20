package com.saran.inner;

public class StaticOuterClass {
	
	static int x=56;
	
	  static class Inner{
		  void display() {
			  System.out.println("Data "+x);
		  }
	  }
	  
	  public static void main(String[] args) {
		StaticOuterClass.Inner outin=new StaticOuterClass.Inner();
		outin.display();
	}
	

}
