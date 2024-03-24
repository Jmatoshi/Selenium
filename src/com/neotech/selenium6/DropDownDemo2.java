package com.neotech.selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
		
		//https://demoqa.com/select-menu
		
				setUp();
				
				//one line
				//Select selDD = new Select(driver.findElement(By.id("oldSelectMenu")));
				
				//locate the web element
				WebElement oldMenu = driver.findElement(By.id("oldSelectMenu"));
				
				//create a select object
				Select selDD = new Select(oldMenu);
				
				selDD.selectByIndex(1);
				Thread.sleep(3000);
				
				
				
				WebElement otherMenu = driver.findElement(By.id("withOptGroup"));
				
				otherMenu.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[contains(text(),'Group 1, option 2')]")).click();
				Thread.sleep(3000);
				
				
				tearDown();
				

		
	}

}
