package com.neotech.selenium5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class OpenOrangeHRM2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//lets read the configuration.properties file using  ConfigReader
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		String browser = ConfigsReader.getProperty("browser");
		//System.out.println(browser);
		
		switch (browser.toLowerCase()){
			case "chrome":
				// System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				driver = new FirefoxDriver();
				break;
				
				default:
					break;
		}
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String website = ConfigsReader.getProperty("url");
		driver.get(website);

		String title = driver.getTitle();
		System.out.println("Title: " + title);
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
