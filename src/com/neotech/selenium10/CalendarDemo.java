package com.neotech.selenium10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://www.delta.com/

		
		
		setUp();
		
		Thread.sleep(2000);
		
		//click on the calendar
		driver.findElement(By.xpath("//span[@class='calDepartLabelCont']/span[2]")).click();
		
		
		
		
		//locate the month
		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		
		//lets get a ticket for August 5th
		
		while(!month.equals("August")) //loop until we see the month we want (August
		{
			//click on next month
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
		
		//itearate on the days and when you find the day, click on it and then break;
		for (WebElement day : days)
		{
			String dayNum = day.getText();
			
			if (dayNum.equals("5"))
			{
				day.click();
				break;
			}
		}
		
		
		//return month 
		
		//exactly the same logic as for the departing month
			//- I want to allow returning within the same month
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!returnMonth.equals("August"))
		{
			//click on next month
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		//at the end of the loop, if we are returning within the same month, then we wont click on next
		//select 7th of August as a return date
		
		
		List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));

		for (WebElement day : returnDays)
		{
			String dayNum = day.getText();
			
			if (dayNum.equals("7"))
			{
				day.click();
				break;
			}
		}
		
		//click on Done button
		driver.findElement(By.xpath("//button[@value='done']")).click();
		
		Thread.sleep(5000);
		
		
		
		
		
		tearDown();
	}


}
