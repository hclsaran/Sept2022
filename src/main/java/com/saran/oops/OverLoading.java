package com.saran.oops;

public class OverLoading {
	
   static int myMethod(int x, int y) {
	   return x+y;
   }
   static double myMethod(double x, double y) {
	   return x+y;
   }
   
   public static void main(String[] args) {
	int num1=myMethod(2,3);
	double num2=myMethod(4.5,3.5);
	System.out.println(num1);
	System.out.println(num2);
	
}
}
