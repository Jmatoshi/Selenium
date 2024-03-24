package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static final String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {

		/*
		 * HW2: Facebook sign up: Open chrome browser Go to "https://www.facebook.com/"
		 * Click on Sign Up link Enter first name Enter last name Enter email address
		 * Re-enter email address Click on Sign Up button
		 */

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Sign Up")).click();

		driver.findElement(By.name("firstname")).sendKeys("Qazim");
		driver.findElement(By.name("lastname")).sendKeys("Katunari");
		driver.findElement(By.name("reg_email__")).sendKeys("qazim.katunari@hotmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("qazim.katunari@hotmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Katunari2024$");

		Thread.sleep(2000);

		Thread.sleep(12000);

		driver.quit();

	}

}
