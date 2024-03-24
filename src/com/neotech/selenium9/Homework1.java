package com.neotech.selenium9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Use WebDriverWait
	        Verify element is enabled
	        Open chrome browser
	        Go to "https://the-internet.herokuapp.com/"
	        Click on the "Dynamic Controls" link
	        Click on enable button
	        Enter "Hello" and verify text is entered successfully
	        Close the browser
		 * 
		 */
		
		
		setUp();
		
		
		
		//where would set up implicit wait?
			// - we declare it after the driver is initialized
			// - we only declare it once, and it is effective during the lfietime of the driver
			// - will apply to findElement() and findElements()
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//click on Dynamic Controls
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		//click on Enable
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		
		//situation:
		//Element is there but it is inactive (not interactable)
		
		
		//define a WebDriverWait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/input"));
		
		wait.until(ExpectedConditions.elementToBeClickable(textBox));
		
		textBox.sendKeys("Berke");
		
		Thread.sleep(2000);
		
		
		
		tearDown();

	} }