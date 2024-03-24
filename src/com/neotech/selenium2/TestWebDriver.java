package com.neotech.selenium2;



public class TestWebDriver {

public static void main(String[] args) {
		
		I_WebDriver driver =  new C_ChromeDriver();
		
		driver.get("https://amazon.com");
		
		driver.getTitle();
		
		driver.close();
	}

	
	
}
