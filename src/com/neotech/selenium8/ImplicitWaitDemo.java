package com.neotech.selenium8;

import java.time.Duration;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// http://webdriveruniversity.com/Ajax-Loader/index.html
		
		setUp();
		
		// Let's define an implicit wait for 30 seconds
		// This wait is valid for the lifetime of the driver
		// If the element is not found, the driver will wait up to 30 seconds
		// After 30 seconds, an exception will be thrown
		// If the element is found before 30 second, the execution will continue
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//Let's try to click the button without any waits set
		driver.findElement(By.id("button1")).click();
		
		Thread.sleep(3000);
		
		//Let's try to locate an element that does not exist
		// driver.findElement(By.id("button2")).click();
		
		// Thread.sleep(3000);
		
		tearDown();
		
	} }