package com.neotech.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.neotechacademy.com/");
		String title = driver.getTitle();
		System.out.println("Title - " + title);
		Thread.sleep(5000); // 5000 milliseconds = 5 seconds
		driver.quit();
	}

}
