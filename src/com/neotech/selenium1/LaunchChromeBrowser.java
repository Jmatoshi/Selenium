package com.neotech.selenium1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// ctrl shift + O

		//System.setProperty("webdriver.chrome.exe", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.neotechacademy.com/");
		
		String expectedURL = "https://www.neotechacademy.com/";
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equals(expectedURL))
		{
			System.out.println("Title: " + driver.getTitle());
		}
		
		else 
		{
			System.out.println("The URL is wrong");
		}
		
		
		
		Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		driver.quit();

	}
}