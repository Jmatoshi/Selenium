package com.neotech.selenium5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenOrangeHRM1 {


	public static void main(String[] args) throws IOException, InterruptedException {

		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";

		System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fis);

		// Starting with Selenium testing process

		WebDriver driver = null;

		if (prop.getProperty("browser").equals("chrome")) {
			// open chrome browser
			// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (driver != null) {
			String website = prop.getProperty("url");
			driver.get(website);

			String title = driver.getTitle();
			System.out.println("Title: " + title);
			Thread.sleep(3000);
		}

		else {
			System.out.println("unsupported browser");
		}
		
		driver.quit();

	}

}
