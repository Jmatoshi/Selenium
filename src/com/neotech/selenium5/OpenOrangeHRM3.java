package com.neotech.selenium5;

import com.neotech.utils.BaseClass;

public class OpenOrangeHRM3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		// String title = driver.getTitle();
				// System.out.println("Title: " + title);
				// Thread.sleep(3000);
		
		
		//let setup the testing session using the setup() method
		
		setUp();
		
		// lets write the test here
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		 Thread.sleep(3000);
		 
	
		//lets terminate the session use tearDown
		 
		 tearDown();
		
		

	}

}
