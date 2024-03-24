package com.neotech.selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// https://jqueryui.com/tooltip/

		
		setUp();
		//If we try to run this, we will get an exception NoSuchElement...
		//This element is inside an iframe
		//driver.findElement(By.id("age")).sendKeys("40");
		
		
		//There are three ways to switch to an iframe
		
		//switch to a frame by index
		driver.switchTo().frame(0); 
		
		WebElement ageTxt = driver.findElement(By.id("age"));
		ageTxt.sendKeys("40");
		
		Thread.sleep(3000);
		
		//We are currently in the frame area, so we will not be able to click on this element
		//driver.findElement(By.linkText("Checkboxradio")).click();
		
		
		//We need to switch back to the main web page
		driver.switchTo().defaultContent();
		
		
		//2nd way, switch to an iframe by name or id
		// Our frame does not have a name or id
		//driver.switchTo().frame("FrameName");
		
		//3rd way, switch to frame by using a web element
		
		WebElement frameEl = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frameEl);
		
		ageTxt.clear();
		Thread.sleep(3000);
		
		ageTxt.sendKeys("25");
		
		Thread.sleep(3000);
		
		//switch to the main content
		driver.switchTo().defaultContent();
		
		
		tearDown();
	}
	
	
	
	
}
