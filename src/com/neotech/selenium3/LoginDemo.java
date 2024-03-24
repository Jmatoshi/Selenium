package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
	
	public static final String url = "https://sis.neotechacademy.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			WebDriver driver = new ChromeDriver();
			
			driver.get(url);
			
			driver.findElement(By.xpath("//input[@id='tUsername']"));
			
			driver.quit();
	}

}
