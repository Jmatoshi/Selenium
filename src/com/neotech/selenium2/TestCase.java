package com.neotech.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Test Case
		// Open chrome browser
		// Go to "https://demo.guru99.com/test/newtours/"
		// Click on Register Link
		//
		// Fill out just
		// First Name:
		// Last Name:
		// Phone:
		// Email:
		// And Click Submit
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Qazim");
		driver.findElement(By.name("lastName")).sendKeys("Katunari");
		driver.findElement(By.name("phone")).sendKeys("444556677");
		driver.findElement(By.id("email")).sendKeys("jmwell");
		driver.findElement(By.name("password")).sendKeys("noreal");
		driver.findElement(By.name("confirmPassword")).sendKeys("noreal");
		
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(12000);
		
		driver.quit();
	}

}
