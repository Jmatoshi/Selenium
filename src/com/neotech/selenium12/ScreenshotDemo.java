package com.neotech.selenium12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class ScreenshotDemo extends CommonMethods {

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com/

		setUp();

		// Login in

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(5);

		// I want to take a screenshot

		// how do we taske a screenshot with snipping tool?

		// 1.open app
		// 2.screenshot
		// 3.save

		// casting to a TakesScreenshot object just so that I can take a screenshot
		TakesScreenshot ts = (TakesScreenshot) driver; // upcasted

		
		
		// this is the screenshot
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//saving the file
		try {
			Files.copy(sourceFile, new File("screenshots/HRM/screenshot01.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Unable to save the screenshot!!!");
		}

		tearDown();

	}

}
