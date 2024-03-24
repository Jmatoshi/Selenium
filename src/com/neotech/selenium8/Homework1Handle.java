package com.neotech.selenium8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework1Handle extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		/*
		1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
		2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
		3) On the Child Window, Enter your email ID and submit.
		4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
		5) Close the Child window on which credentials are displayed.Switch to the parent window.
		6) Quit all browsers
		*/
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()= 'Click Here']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator <String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		
		//We need to change the focus to the child window
		
		driver.switchTo().window(childWindow);
		
		
		
		
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("testachademy@gmail.com");
	
		
		//email.sendKeys("test@gmail.com");
		
		//.sendKeys("test@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnLogin")).click();
		//Thread.sleep(2000);
		
		
		String userId = driver.findElement(By.xpath("//tr[4]/td[2]")).getText();
		System.out.println("Username: "+userId);
		String userPss = driver.findElement(By.xpath("//tr[5]/td[2]")).getText();
		System.out.println("Password: "+userPss);
		
		Thread.sleep(2000);
		tearDown();
		
		
		
		
		
		

	}

}
