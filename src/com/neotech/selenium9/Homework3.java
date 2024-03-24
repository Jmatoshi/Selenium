package com.neotech.selenium9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework3 extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {

		/*
		 *         Add Employee
			        Open chrome browser
			        Go to "https://hrm.neotechacademy.com/"
			        Login into the application
			        Click on PIM > Add Employee 
			        Add Employee
			        Log out 
			        Quit the browser
		 */
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//send the username and password we have in configs

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		//click on PIM list item
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		//click on Add Employee
		driver.findElement(By.linkText("Add Employee")).click();
		
		
		//at this point, it does take a while to load the add employee form
		
		WebDriverWait nameBoxWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		nameBoxWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));
		
		
		//send employee data
		driver.findElement(By.id("first-name-box")).sendKeys("NewUser");
		driver.findElement(By.id("last-name-box")).sendKeys("NewUser");
		
		WebElement sl = driver.findElement(By.id("location"));
		Select s = new Select(sl);
		s.selectByVisibleText("Canadian Regional HQ");
		
		
		WebDriverWait saveBtnWait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		
		saveBtnWait.until(ExpectedConditions.elementToBeClickable(By.id("modal-save-button")));
		
		driver.findElement(By.id("modal-save-button")).click();
		
		
		//it takes a while to save the added employee
		//so I will wait for the personal details tab to show up, and then log out.
		FluentWait<WebDriver> personalDetailsWait = new FluentWait<WebDriver> (driver);
		personalDetailsWait.withTimeout(Duration.ofSeconds(20));
		personalDetailsWait.pollingEvery(Duration.ofSeconds(2));
		
		personalDetailsWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));	
		
		//logout 
		driver.findElement(By.id("account-job")).click();
		driver.findElement(By.id("logoutLink")).click();
		
		
		//Break until: 1:00
		
		tearDown();

	}

	
	
}
