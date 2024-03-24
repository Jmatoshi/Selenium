package com.neotech.selenium7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

/*Homework 2:
    Alert text verification
    Open chrome browser
    Go to https://demoqa.com/
    Click on "Alerts, Frame & Windows" link
    Click on "Alerts" links on the left side
    Click on button to see Alert
    Verify alert box with text "You clicked a button" is present
    Click on 3rd button in the page
    Verify alert box with text "Do you confirm action?" is present and click "confirm"
    Click on 4 th button in the page and enter your name and click ok.
    Quit browser
    */

public class Homework extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		setUp();
		
		
		
		
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()= 'Alerts' ]")).click();
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("The alert of the alert is: " + alert);
		
		driver.findElement(By.id("confirmButton")).click();
		
		//re assigning a new alert to existing alert object
		
		alert = driver.switchTo().alert();
		System.out.println("The alert of the alert is: " + alert.getText());
		alert.dismiss();
		
		
		driver.findElement(By.id("promtButton")).click();
		
		alert = driver.switchTo().alert();
		alert.sendKeys("Hello");
		
		alert.accept();
		
		Thread.sleep(3000);
		
		
		
		
		
		tearDown();

		
		
		
		
		
	}
	
	
	
}
