package com.saran.thread;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecService2 {
	 public static void main(String[] args) throws InterruptedException, ExecutionException {  
	        ExecutorService executorService = Executors.newSingleThreadExecutor();  
	        
	        Set<Callable<String>> callables = new HashSet<>();  //<>Generics
	        callables.add(new Callable<String>() {  
	            public String call() throws Exception {  
	                return "Task 1";  
	            }  
	        });  
	        callables.add(new Callable<String>() {  
	            public String call() throws Exception {  
	                return "Task 2";  
	            }  
	        });  
	        callables.add(new Callable<String>() {  
	            public String call() throws Exception {  
	                return "Task 3";  
	            }  
	        });  
	  
	   //    String result = executorService.invokeAny(callables);  
	  
	   //     System.out.println("result = " + result); 
	        
	        
	          List<Future<String>> futures=executorService.invokeAll(callables);
	          for(Future<String> future:futures){
	          System.out.println("Future.get  "+future.get());
	          }
	        executorService.shutdown();
	        
	 }
	       

}
