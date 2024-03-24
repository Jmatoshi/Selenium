package com.neotech.selenium7;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowHandlePractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://demoqa.com/browser-windows

		
		setUp();
		
		System.out.println("Title->" + driver.getTitle());
		String mainWindowHandle = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		//at this moment my focus is at the first page (main)
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Number of windows: " + allWindowHandles.size());
		
		
		
		for (String handle : allWindowHandles)
		{
			if (!handle.equals(mainWindowHandle))
			{
				//switch to that page
				driver.switchTo().window(handle);
			//	Thread.sleep(2000);
			//	System.out.println("Title->" + driver.getTitle()); -- try it
				
				Thread.sleep(2000);
				
				//close that page
				driver.close();
				
			}
		}
		
		
		tearDown();
	
	
	
	
} }
