package com.neotech.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		// ctrl shift + O

		//System.setProperty("webdriver.chrome.exe", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//lets locate email add text input
		
		driver.findElement(By.id("email")).sendKeys("myemail@gmail.com");
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("notreal");
		
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("u_0_5_bE")).click(); dosent work
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
