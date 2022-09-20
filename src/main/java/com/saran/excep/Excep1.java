package com.saran.excep;

public class Excep1 {
   public static void getInt() {
		int z1=Integer.parseInt("abc");
		
   }
	public static void main(String[] args) {
		int x = 12;
		int y = 3;

		try {
			getInt();
			int z = x / y;
			System.out.println(z);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("closing up of memory resources");
		}

		System.out.println("conitue working");

	}

}
