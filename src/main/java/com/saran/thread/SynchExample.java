package com.saran.thread;

class Test{
	void printNumbers(int n) throws InterruptedException 
    {
		 
            for (int i = 1; i <= n; i++) 
            {
                System.out.println(Thread.currentThread().getName() + " :: "+  i);
                Thread.sleep(500);
            }
		  
        
    }
	
	synchronized void  printNumbersMethod(int n) throws InterruptedException 
    {
		
            for (int i = 1; i <= n; i++) 
            {
                System.out.println(Thread.currentThread().getName() + " :: "+  i);
                Thread.sleep(500);
            }
		  
        
    }

	
}
//final keyword can be used for classes,methods and variables
//Synchronization can be done in two ways: one is by block and other one is by using in the method
public class SynchExample {
	public static void main(String[] args) {
		final Test test = new Test();
		 
        //first thread
        Runnable r = new Runnable() 
        {
            public void run() 
            {
                try {
                	test.printNumbers(3);
                    test.printNumbersMethod(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       
        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();
        //ONE->1,2,3 TWO-1,2,3
    }
	}
	

