package com.neotech.selenium7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 
		 *  Alert text verification
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
		 * 
		 */

		setUp();
		
		
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		//span[text()='Alerts']-----> Alerts 
		//span[contains(text(),'Alerts')] ---> has a method inside: contains(text(),'Alerts')
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click(); //this will trigger an alert
		
		Thread.sleep(2000);
	
	//	ALT + TAB - Switch from different tabs in windows
	//	Command + TAB -- does the same in mac
		
		
		//handle the alert
		Alert alert = driver.switchTo().alert();	
		System.out.println("The text of the alert is: " + alert.getText());
		
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		
		//I am re-assigning the new Alert to the existing alert object
		alert = driver.switchTo().alert();
		System.out.println("The text of the alert is: " + alert.getText());
		alert.dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();

		alert = driver.switchTo().alert();
		alert.sendKeys("Mucteba");
		
		alert.accept();
		
		Thread.sleep(2000);
		
		
		tearDown();
		
	}

	
	
	
	
}
