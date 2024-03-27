package com.neotech.selenium12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		// Negative test of HRM login

		// send correct username
		// leave password empty
		// click on submit method
		// take a screenshot

		setUp();

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), " ");

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(5);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot02.png"));
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Unable to save the screenshot!!!");
		}

		tearDown();

	}

}
