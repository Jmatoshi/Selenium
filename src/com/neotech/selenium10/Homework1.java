package com.neotech.selenium10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework1  extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		/*
		 
		 ==================  Lesson 09 HW 1 =======================
			TC: Update Customer Information
			
			1) Open chrome browser
			2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
			3) Login to the application
			4) Verify customer "Susan McLaren" is present in the table
			5) Click on customer details
			6) Update customers last name and credit card info
			7) Verify updated customers name and credit card number is displayed in table
			8) Close browser
		  
		 */

		
		
		setUp();
		
		
		//login
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		
		//verify that customer Susan McLaren is there
		
		
		//1st way
			//locate the table, get the text from it and check if it contains Susan
		
		
		//2nd way: 
			//since I have to click on the customer record details, I will get all rows separately
			//check which row susan is, and then click on the respective button for details
		
		int rowIndex = -1;
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
		for (int i = 1; i < rows.size(); i++) //intentionally skip the header located at rows[0]
		{
			String rowText = rows.get(i).getText();
		//	System.out.println(rowText);
			
			rowIndex = i + 1;
			
			if (rowText.contains("Susan McLaren"))
			{
				//click on order details
				
				//what is the path for the button:
				//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[????]/td[13]
				
				//I do not know the record number where Susan will be, so I need to modify the 
				//path according to the location where I find Susan
				
				System.out.println("Finding element i ---> " + i);
				
				String path = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+ rowIndex +"]/td[13]";
				
				System.out.println("Path: " + path);
				
				driver.findElement(By.xpath(path)).click();
				
				break;
			}
			
			
		}
		
		Thread.sleep(3000);
		
		
		//update the customer info
		
		WebElement cName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		
		
		String currentName = cName.getAttribute("value");
		System.out.println("Current Name: " + currentName);
		
		cName.clear();
		cName.sendKeys("Susan Doe");
		
		
		//update card info
		WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		
		cardNumber.clear();
		cardNumber.sendKeys("4548454465431");
		
		//update
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
		Thread.sleep(3000);
		
		
		//verify that the name changed
		String newName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/"
				+ "tbody/tr["+ rowIndex +"]/td[2]")).getText();
		
		//how did I build this path???
			//the name will be same row number as I found on the for loop, but I dont need to click on 
			// column 13. In this case the name is in column 2.
		
		System.out.println("newName: " + newName);
		
		
		
		
		tearDown();
		
		

	} }
