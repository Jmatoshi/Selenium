package com.neotech.selenium7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowHandleDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// https://accounts.google.com/signup
		
		
		
		setUp();
		
		
		System.out.println("Title -> " + driver.getTitle());
		
		//This gives us a unique ID for the current tab
		System.out.println("Handle -> " + driver.getWindowHandle());
	
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(2000);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("The number of open tabs: " + allWindowHandles.size());
		
		
		
		Iterator<String> it = allWindowHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();
		
		System.out.println("Window1: " + window1);
		System.out.println("Window2: " + window2);
		
		//switch to the other window
		driver.switchTo().window(window2);
		
		//get the title of the window
		String title2 = driver.getTitle();
		
		System.out.println("Title -> " + title2);
		
		Thread.sleep(2000);
		
		//this will close the one that driver is currently focused on.
		driver.close();
		
		Thread.sleep(2000);
		
		tearDown();

	}
	
	
	
}
