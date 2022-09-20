package com.saran.oops;

public class Static2 {
	
	static int x=0;// will get memory each time when the instance is created
	
	Static2(){
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		Static2 s1=new Static2();
		Static2 s2=new Static2();
		Static2 s3=new Static2();	
		
	}

}
