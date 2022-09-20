package com.saran.thread;

/*
 * Why we have go for Runnable interface when you have already Thread class
 * 
 * 
 */
 

public class Thread1 extends Thread {
	 
	   public void run() {
		   try {
			   //moving thread to the state timed waiting
			   Thread.sleep(2000);
		   }catch(InterruptedException e) {e.printStackTrace();}
		
		    System.out.println("Thread message");
		   }
		 
	   
	    
	   public static void main(String[] args) {  //main thread
		   Thread1 t1=new Thread1(); //Child Thread
		   t1.start();
		   System.out.println("continue working");
		   
		
	}
	
	

}
