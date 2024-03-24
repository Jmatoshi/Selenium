package com.neotech.selenium11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// https://hrm.neotechacademy.com/client/#/dashboard

		setUp();

		// setting up the username
		WebElement username = driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));

		// setting up the password
		WebElement password = driver.findElement(By.id("txtPassword")); // /** means documentation comments
		sendText(password, ConfigsReader.getProperty("password"));

		wait(3);

		// click on the login button
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type ='submit']"));
		loginBtn.click();

		wait(3);
		
		
		//lets validate if we have log in successfully or not
		WebElement logo = driver.findElement(By.id("ohrm-small-logo"));
		
		if (logo.isDisplayed())
		{
			System.out.println("Test passed!!!!");
		}
		else
		{
			System.out.println("Test failed!!!!!");
		}

		tearDown();

	}

}
