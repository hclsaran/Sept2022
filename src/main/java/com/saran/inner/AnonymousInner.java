package com.saran.inner;

interface Vehicle{
	public void noise();
}

public class AnonymousInner {
	public static void main(String[] args) {
		
		//Anonymous Inner class
		Vehicle v=new Vehicle() {
			public void noise() {
				System.out.println("calling noise");
			}
		};
		
		v.noise();
	}

}
