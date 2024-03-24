package com.neotech.selenium9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTableAnotherWay extends BaseClass {

	
	public static void main(String[] args) throws InterruptedException {
		// https://hrm.neotechacademy.com/

		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//login 

		//login
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//go to PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(4000);
		
		
		//click on the row that contains Linda
		String expected = "Linda";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
		
		
		for (int i = 0; i < rows.size(); i++)
		{
			String rowText = rows.get(i).getText();
			System.out.println(i + " - " + rowText);
			
			if(rowText.contains(expected))
			{
				//at this point, we know that Linda will be in record i
				
				//then I can build a path 
				//table[@id='employeeListTable']/tbody/tr[7]/td[1]
				
				//but if I use static numbers, we are dealing with a dynamic table
				
				
				int rowIndex = i + 1;
				String path = "//table[@id='employeeListTable']/tbody/tr["+rowIndex+"]/td[1]";
				
				driver.findElement(By.xpath(path)).click();
				
				break;
			}
			
			
		}
		
		
		Thread.sleep(5000);
		
		
		
		tearDown();
	
	}
	
}
