package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

public static final String url ="https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
	
		/*
		 * 
		 *     Using Css ONLY
			    TC 1: Facebook login: 
			        Open chrome browser
			        Go to “https://www.facebook.com/”
			        Enter valid username and valid password and click login 
			        User successfully logged in
		 */

		
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("John");
		driver.findElement(By.cssSelector("#pass")).sendKeys("john123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[id^='u_0']")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
}
