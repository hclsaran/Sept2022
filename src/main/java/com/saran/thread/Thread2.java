package com.saran.thread;

public class Thread2  implements Runnable{

	@Override
	public void run() {
		System.out.println("My thread is running");
	}
	
	public static void main(String[] args) {
		Thread2 t2=new Thread2();
		Thread tt=new Thread(t2);
		tt.start();
		
	}
	
	

}
