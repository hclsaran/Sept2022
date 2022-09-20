package com.saran.thread;

class Thread3 extends Thread{
	
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e) {e.printStackTrace();}
		}
	
}
class Thread4 extends Thread{
	
	public void run() {
			System.out.println(Thread.currentThread().getName());
				 try {
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {e.printStackTrace();}
		}
	
}

class Thread5 extends Thread{
	
	public Thread5(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("My Thread - START"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			doProcessing();
			
		}catch(InterruptedException e) {e.printStackTrace();}
		System.out.println("My Thread - END"+Thread.currentThread().getName());
		
	}
	
	public void doProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
	
}

class Thread6 extends Thread{
	public Thread6(String name) {
		super(name);
		
	}
	
	public void run() {
		System.out.println("My Thread - START"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			doProcessing();
			
		}catch(InterruptedException e) {e.printStackTrace();}
		System.out.println("My Thread - END"+Thread.currentThread().getName());
	}
		public void doProcessing() throws InterruptedException{
			Thread.sleep(5000);
		}
	
}
public class TwoThreads {
	
	 public static void main(String[] args) {
		Thread t3=new Thread(new Thread2(),"T3");
		Thread t4=new Thread(new Thread3(),"T4");
		t3.start();
		t4.start();
		System.out.println("Threads has been started");
		Thread t5=new Thread5("T5");
		Thread t6=new Thread6("T6");
		System.out.println("Starting Thread5&6");
		t5.start();
		t6.start();
		System.out.println("Thread5&6 has been started");
		
		
		
	}

}
