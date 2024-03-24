package com.neotech.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * HW2: Opening Page on Firefox Browser Open Firefox browser Navigate to
		 * “https://www.redfin.com/” Verify that you have navigated to
		 * (https://www.redfin.com/) End the Session (close the browser)
		 */

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redfin.com/");

		String expectedURL = "https://www.redfin.com/";
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("Title: " + driver.getTitle());
		}

		else {
			System.out.println("Verification Failed!!!!");
		}

		Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		driver.quit();

	}

}
