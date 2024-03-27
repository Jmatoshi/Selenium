package com.neotech.selenium13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class HomeworkDrag extends CommonMethods{

	public static void main(String[] args) {
	
		
		
		
		/*

		 * Open chrome browser 

		 * Go to https://demo.guru99.com/test/drag_drop.html 

		 * Drag the following blocks in different ways 

		 * 		Drag BANK to DEBIT SIDE 

		 * 		Drag SALES to CREDIT SIDE 

		 * 		Drag 5000 to DEBIT SIDE 

		 * 		Drag 5000 to CREDIT SIDE 

		 * Close the browser

		 */

		

		

		setUp();

		

		//Element (Bank) to be dragged

		WebElement from1 = driver.findElement(By.id("credit2"));

		

		//Element (DEBIT SIDE) where to drop the Bank element

		WebElement to1 = driver.findElement(By.id("bank"));

		

		

		//Element (SALES) to be dragged

		WebElement from2 = driver.findElement(By.id("credit1"));

		

		

		//Element (CREDIT SIDE) where to drop the SALES element

		WebElement to2 = driver.findElement(By.id("loan"));

		

		

		//Element (5000) to be dragged

		WebElement from3 = driver.findElement(By.id("fourth"));

		

		//Element (Debit Side) where to drop 5000

		WebElement to3 = driver.findElement(By.id("amt7"));

		

		

		//Element (Credit Side) where to drop 5000

		WebElement to4 = driver.findElement(By.id("amt8"));

		

		

		Actions action = new Actions(driver);

		

		

		action.dragAndDrop(from1, to1).perform();

		

		wait(2);

		

		action.dragAndDrop(from2, to2).perform();

		

		wait(2);

		

		action.dragAndDrop(from3, to3);

		

		wait(2);

		

	//	action.dragAndDrop(from3, to4);

		

		action.clickAndHold(from3).moveToElement(to4).release().perform();

		

		

		//verify if Perfect! is shown

		

		if (driver.findElement(By.linkText("Perfect!")).isDisplayed())

		{

			System.out.println("Perfect! -- is displayed!");

		}

		else

		{

			System.out.println("Perfect! -- is NOT displayed!");

		}

		

		

		wait(2);

		

		tearDown();

		
		
		

	}

}
