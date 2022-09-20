package com.saran.oops;

public class StringTest {
	
	public static void main(String[] args) {
		//String is always immutable
		String[] cars= {"volvo","bmw"};
		System.out.println(cars[0]);
		String s1="Adam";
		
		String s2="Adam";
		System.out.println(s2.toLowerCase());
		System.out.println("CharAt"+s2.charAt(0));
		String s3=new String("Adam");
		
		if(s1.equals(s2)) {
			System.out.println(true);
		}
		if(s1==s2) {
			System.out.println(true);
		}
		if(s1==s3) {
			System.out.println(false);
		}
	}

}
