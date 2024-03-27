package com.neotech.selenium13;

import java.io.File;

import java.io.IOException;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;



import com.google.common.io.Files;

import com.neotech.utils.CommonMethods;

import com.neotech.utils.ConfigsReader;



public class Homework2 extends CommonMethods{



	public static void main(String[] args) {

		/*

		 *

		 

		 	Go to https://hrm.neotechacademy.com/

			Log in using our custom methods

			Go to PIM menu

			Add an employee

			Go to Employee List

			Get the list of the employees (Using tables - tr and td) 

			Loop to search for the employee you added

			When you find the employee - click on it.

			Take a screenshot

		 

		 */



		setUp();

		

		

		//login

		

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));

		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		

		

		//navigate to PIM

		click(driver.findElement(By.id("menu_pim_viewPimModule")));

		

		//click on Add Employee

		click(driver.findElement(By.linkText("Add Employee")));

		

		

		wait(2);

		

		waitForVisibility(driver.findElement(By.id("first-name-box")));

		

		//send Employee Data

		

		sendText(driver.findElement(By.id("first-name-box")), "John");

		sendText(driver.findElement(By.id("last-name-box")), "Doe2");

		

		//select a dropdown element

		selectDropdown(driver.findElement(By.id("location")), "Australian Regional HQ");

		

		//get the employee id

		String empId = driver.findElement(By.id("employeeId")).getAttribute("value");

		

		System.out.println("Employee ID: " + empId);

		

		click(driver.findElement(By.id("modal-save-button")));

		

		wait(2);

		

		//I know that it will take time to save the employee, so I can wait for the next element to show

		waitForVisibility(driver.findElement(By.id("pimPersonalDetailsForm")));

		

		//lets click on the Employee List

		click(driver.findElement(By.linkText("Employee List")));

		

		

		boolean found = false;

		

		

		while (!found)

		{

			wait(2);

			

			//get all id's on the current page

			

			List<WebElement> idList = driver.findElements(By.xpath(""

					+ "//table[@id='employeeListTable']/tbody/tr/td[2]"));

			

			

			//loop through the id's on this page and if we find it, 

				//set found true, 

				//click on the element,

				//break;

			

			for (WebElement el : idList)

			{

				if(el.getText().equals(empId))

				{

					found = true;

					el.click();

					break;

				}

			}

			

			

			//if  I come at this step and found is false, the employee is not on this page

				//then I should go to the next page

			

			//if I come at this point, and found is true, that means I found the employee, 

				//so I dont need to do anything

	

			

			if (!found)

			{

				System.out.println("I need to go to the next page!");

				click(driver.findElement(By.xpath("//i[text()='chevron_right']")));

			}

			

			

			

		}

		

		

		waitForVisibility(driver.findElement(By.id("pimPersonalDetailsForm")));

		

		

		

		

		

		//take a screenshot

		

		//1. Create TakesScreenshot Object

		TakesScreenshot ts = (TakesScreenshot) driver;

		

		//2. Call getScreenshotAs

		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		

		//3. Save this screenshot

		try {

			Files.copy(sourceFile, new File("screenshots/Lesson13/Homework2.png"));

		} catch (IOException e) {

			System.out.println("Screenshot was not saved...");

		}

		

		wait(2);

		

		tearDown();
		
	}

}
