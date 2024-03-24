package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static final String url = "https://www.facebook.com";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("JoeDoe@gmail.com");

		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("123@home");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@name='login']")).click();

		Thread.sleep(3000);

		driver.quit();

	}

}
