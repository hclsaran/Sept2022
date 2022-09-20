package com.saran.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecService1 {  
	  
    public static void main(String[] args) {  
        ExecutorService executorService = Executors.newSingleThreadExecutor();  
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);  
        ExecutorService executorService2 = Executors.newScheduledThreadPool(10);  
        
        
        executorService.execute(new Runnable() {  
              
            @Override  
            public void run() {  
                System.out.println("ExecutorService");  
                  
            }  
        });  
        executorService.shutdown();  
    }  
}   
