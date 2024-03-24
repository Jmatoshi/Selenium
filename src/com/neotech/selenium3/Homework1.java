package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	
	public static final String url= "https://demo.guru99.com/test/newtours/"; //final wont let you make changes

	public static void main(String[] args) throws InterruptedException {
		// HW1:
		/*Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		Fill out ALL required info
		Click Submit
		User successfully registered
		(Create the script using different locators)

		HW2: Facebook sign up:
		Open chrome browser
		Go to "https://www.facebook.com/"
		Click on Sign Up link
		Enter first name
		Enter last name
		Enter email address
		Re-enter email address
		Click on Sign Up button
*/
		//set driver location in system property
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Lena");
		driver.findElement(By.name("lastName")).sendKeys("Rugova");
		driver.findElement(By.name("phone")).sendKeys("2223334455");
		driver.findElement(By.id("userName")).sendKeys("lena.rugova@gmail.com");
		driver.findElement(By.id("email")).sendKeys("lena.rugova@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("1234");
		
		Thread.sleep(4000);
		driver.findElement(By.name("submit")).click();
		String expectedURL = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualURL = driver.getCurrentUrl();
		
		if (expectedURL.equals(actualURL))
		{
			System.out.println("Test Passed!");
		}
		
		else
		{
			System.out.println("Test Failed");
		}
		Thread.sleep(12000);
		
		driver.quit();
		
		
		
		
		
	
	}

}
