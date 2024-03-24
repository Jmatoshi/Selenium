package com.neotech.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {

		/*HW1: Amazon Page Title Verification: 
			Open chrome browser
			Go to “https://www.amazon.com/”
			Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
			End the Session (close the browser).*/

			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String expectedURL = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equals(expectedURL))
		{
			System.out.println("Title: " + driver.getTitle());
		}
		
		else 
		{
			System.out.println("Verification Failed!!!!");
		}
		
		Thread.sleep(15000);
		driver.quit();

		
		
		

	}

}
