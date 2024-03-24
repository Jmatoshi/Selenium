package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelector {

	public static final String url = "https://sis.neotechacademy.com/";
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#tPassword")).sendKeys("Neotech$123");
		driver.findElement(By.cssSelector("input.buttonBig")).click();
		
		Thread.sleep(15000);
		
		
		
		
		driver.quit();
		
		
		
	}

}
