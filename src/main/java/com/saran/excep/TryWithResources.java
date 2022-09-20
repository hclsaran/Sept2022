package com.saran.excep;

import java.io.FileOutputStream;

public class TryWithResources {
	/*Try with resources ->no need of finally block to close the file
	 * 
	 * It will close automatically if we use try with resources
	 * below is the example
	 */
	
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("saran.txt")){
			String txt="Welcome to the world of Java Excpetion";
			byte arr[]=txt.getBytes();
			fos.write(arr);	
		
		}catch(Exception e) {System.out.println(e.getMessage());}
		
		
	}

}
