package com.neotech.selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	// HW1: Amazon Page Title Verification:
			// Open chrome browser
			// Go to “https://www.amazon.com/”
			// Verify Title “Amazon.com: Online Shopping for Electronics, Apparel,
			// Computers, Books, DVDs & more” is displayed
			// End the Session (close the browser).

		public static void main(String[] args) throws InterruptedException {
			
//			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();  //up-casting
			
			driver.get("https://www.amazon.com/");
			
			String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
			String actualTitle = driver.getTitle();
			
			System.out.println("Acutal Ttitle: " + actualTitle);
			
			if (expectedTitle.equalsIgnoreCase(actualTitle)) {
				System.out.println("Test passed!");
			}
			else {
				System.out.println("Test failed!");
			}
			
			Thread.sleep(3000);
			driver.quit();
		}

	
	
}
