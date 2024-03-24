package com.neotech.selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://demoqa.com/nestedframes/

		
		setUp();
		
		//Switch to the Parent Frame
		
		driver.switchTo().frame("frame1"); //using name or id
		
		Thread.sleep(2000);
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		
		//lets get the <p> element and its text in the childFrame
		WebElement p = driver.findElement(By.xpath("//body/p"));
		String text = p.getText();
		
		System.out.println("The text inside the child frame is: " + text);
		
		Thread.sleep(2000);
		
		
		//we can go to the parent frame
		//driver.switchTo().parentFrame();
		
		//this will switch the focus of the driver to the main page
		driver.switchTo().defaultContent();
		
		tearDown();
		
	
	
	
	
}}
