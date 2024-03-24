package com.neotech.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * HW1: Open chrome browser Go to "https://demo.guru99.com/test/newtours/" Click
		 * on Register Link Fill out ALL required info Click Submit User successfully
		 * registered (Create the script using different locators)
		 * 
		 * HW2: Facebook sign up: Open chrome browser Go to "https://www.facebook.com/"
		 * Click on Sign Up link Enter first name Enter last name Enter email address
		 * Re-enter email address Click on Sign Up button
		 */

		// C

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("Qazim");
		driver.findElement(By.name("lastname")).sendKeys("Katunari");
		driver.findElement(By.name("reg_email__")).sendKeys("qazim.katunari@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("qazim.katunari@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Katunari2024$");
		Thread.sleep(2000);

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Nov");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("13");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1975");
		
		WebElement genderM = driver.findElement(By.xpath("//input[contains(@name, 'sex') and contains(@value, '2')]"));
		genderM.click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(12000);
		

		
		driver.quit();
		

	}

}
