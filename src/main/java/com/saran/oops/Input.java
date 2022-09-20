package com.saran.oops;

import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String uname=sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("User Name is "+uname);
		System.out.println("Age is "+age);
		
	}

}
