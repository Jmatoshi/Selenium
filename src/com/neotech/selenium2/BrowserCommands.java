package com.neotech.selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	//1. Open chrome browser
	//2. Navigate to “https://www.zillow.com/”
	//3. Navigate to “https://www.google.com/”
	//4. Navigate back to Zillow Page
	//5. Refresh current page
	//6. Verify url contains “Zillow”

	
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  //up-casting
		
		//1st way
		//use .get() method --> this does not maintain the browsing history
		//driver.get("https://www.zillow.com/");
		
		//2nd way
		//use .navigate().to() method
		//it will maintain history --> so that we can go forward and back
		
		driver.navigate().to("https://www.zillow.com/");
		
		//To see that you've navigated to this webpage, give a short pause 
		Thread.sleep(1000);
		
		//Let's try to maximize the screen
		// driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.navigate().back(); //get back to the previous page
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		String currentUrl = driver.getCurrentUrl();
		String url = "https://www.zillow.com/";
		
		if (url.equals(currentUrl)) {
			System.out.println("Test passed!");
		}
		else {
			System.out.println("Test failed!");
			System.out.println("Current url -> " + currentUrl);
			System.out.println("Expected url -> " + url);
		}
		
		driver.quit();
		
		
	}

	
	
	
	
	
	
	
}
