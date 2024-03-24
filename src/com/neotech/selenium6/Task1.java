package com.neotech.selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUp();
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Nov");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("13");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1975");
		
		
		System.out.println("The number of options for year is: " + year.getOptions().size());
		System.out.println("The number of options for months is: " + month.getOptions().size());
		System.out.println("The number of options for days is: " + day.getOptions().size());
		
		WebElement genderM = driver.findElement(By.xpath("//input[contains(@name, 'sex') and contains(@value, '2')]"));
		genderM.click();
		Thread.sleep(2000);
		
		//driver.findElement(By.name("websubmit")).click();
		Thread.sleep(12000);
		
	}

}
