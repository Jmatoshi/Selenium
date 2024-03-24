package com.neotech.selenium6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		
		driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		
		Thread.sleep(2000);
		
		WebElement dd = driver.findElement(By.id("dAcademicYear_list"));
		
		
		Select selDD = new Select(dd);
		Thread.sleep(2000);
		
		selDD.selectByIndex(0); //select the first option
		Thread.sleep(2000);
		
		

		selDD.selectByValue("10"); //select using the value attribute
		Thread.sleep(2000);
		
		
		
		selDD.selectByVisibleText("2014-2015"); //select based on the text showing on the dropdown items
		Thread.sleep(2000);
		
		
		List<WebElement> options = selDD.getOptions();
		System.out.println("The size of the list is " + options.size());
		System.out.println(options);
		
		//for (int i = 0; i <options.size(); i++)
		//{
			//selDD.selectByIndex(i);
			//System.out.println(options.get(i).getText());
			//Thread.sleep(2000);
		//}
		

		
		
		for (WebElement el : options)
		{
			selDD.selectByVisibleText(el.getText());
			Thread.sleep(2000);
		}
		tearDown();

	}

}
