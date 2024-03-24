package com.neotech.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

public static final String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
		driver.findElement(By.cssSelector("#ctl00_MainContent_password")).sendKeys("test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		
		WebElement header = driver.findElement(By.tagName("h1"));
		
		if (header.isDisplayed())
		{
			System.out.println("The header " + header.getText() + " is displayed!");
		}
		else
		{
			System.out.println("The header is NOT displayed!");
		}
		
		
		//check if the username Tester is ther
		
		String loginText = driver.findElement(By.cssSelector("div.login_info")).getText();
		if(loginText.contains("Tester"))
		{
			System.out.println("Tester is logged in successfully!");
		}
		else
		{
			System.out.println("Login failed!");
		}
		
		
		
		
		
		
		driver.quit();
		
	
	
	
}}
