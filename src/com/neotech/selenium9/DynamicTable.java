package com.neotech.selenium9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTable extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// https://hrm.neotechacademy.com/

		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//login
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//go to PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(4000);
		
		//Can we find all the rows that contain Linda
		
		String expected = "Linda";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		
	
		for (int i = 0; i < rows.size(); i++)
		{
			
			String rowText = rows.get(i).getText();
			System.out.println("Row text: " + rowText);
			
			//if row contains Linda, I want to click on that row
			if (rowText.contains(expected))
			{
				//if the whole record is clickable
				//	rows.get(i).click();
				
				
				//1st way: 
					//if this condition is true, Linda is in row[i]
					//then, I could get all the 2nd column elements and then click on
					// element with index i
			//	driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr/td[2]")).get(i).click();
				
				//2nd 
				List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='employeeListTable']//td[1]"));
				firstColumn.get(i).click();
				
				
				System.out.println("Clicked on record: " + i);
				
				break;
			}
			
		}
		
			
		Thread.sleep(5000);
		
		tearDown();
	}
	
	
	
	
	
}
