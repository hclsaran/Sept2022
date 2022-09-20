package com.saran.inner;

public class LocalInner {
	private int x=34;
	void display() {
		class Local{
			void localMethod() {
				System.out.println("OutClass variable "+x);
			}
		}
		
		Local xx=new Local();
		xx.localMethod();
	
		
	}
	 public static void main(String[] args) {
		LocalInner abc=new LocalInner();
		abc.display();
	}

}
