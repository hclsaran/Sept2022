package com.saran.oops;

import java.util.Arrays;

class Emp{
	int empId;
	String empName;
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}

public class Array {
	
	public static void main(String[] args) {
		int[] arr;
		arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Index  "+i+   "  "+arr[i]);
		}
		
		Emp[] emp;
		emp=new Emp[3];
		emp[0]=new Emp(111,"Jeathon");
		emp[1]=new Emp(222,"Amar");
		emp[2]=new Emp(333,"Adam");
		//generic for loop
		for(int i=0;i<emp.length;i++) {
			System.out.println("Index  "+i +emp[i].empId+   "  "+emp[i].empName);
		}
		//enhanced for loop
		for(Emp emp2:emp) {
			System.out.println(emp2);
		}
		//functional programming
		Arrays.asList(emp).forEach(System.out::println);  //Java 8
	}

}
