package com.neotech.selenium6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String alertText = simpleAlert.getText();
		System.out.println("the simple alert text is: "+ alertText);
		simpleAlert.dismiss();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("submit")).click();
		
		Alert secondAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		secondAlert.accept();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		tearDown();
		

	}

}
