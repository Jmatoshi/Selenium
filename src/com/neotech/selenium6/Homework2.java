package com.neotech.selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 2: Orange HRM Application Negative Login: Open Chrome browser Go to
		 * https://hrm.neotechacademy.com/ Enter valid username Leave password field
		 * empty Verify error message with text "Password cannot be empty" is displayed.
		 */

		setUp();

		String username = ConfigsReader.getProperty("username");
		String password = " ";
		driver.findElement(By.id("txtUsername")).sendKeys(username);

		WebElement passwordBox = driver.findElement(By.id("txtPassword"));
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		
		WebElement errorMsg = driver.findElement(By.id("txtPassword-error"));
		

		if (errorMsg.isDisplayed()) {
			System.out.println("Test passed");
		}

		else {
			System.out.println("Test failed");
		}
		
		tearDown();
		
		

	}

}
