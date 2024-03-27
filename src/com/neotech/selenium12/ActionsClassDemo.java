package com.neotech.selenium12;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;



import com.neotech.utils.CommonMethods;



public class ActionsClassDemo extends CommonMethods {



	public static void main(String[] args) {

		// https://www.amazon.com/

		

		

		setUp();

		

		Actions action = new Actions(driver);

		

		//no action will be done, without the .perform()

		action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();

		

		wait(5);

		

		//did the cursor move to the element?

		WebElement el = driver.findElement(By.id("nav-flyout-ya-newCust"));



		if (el.getText().contains("Start"))

		{

			System.out.println("Menu was displayed!!");

		}

		else

		{

			System.out.println("Menu was NOT displayed!!!");

		}

		

		

		//how do we perform a right click?

		action.contextClick(el).perform();

		

		wait(5);

		

		

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		

		//we can use sendText() to send text to it

		//sendText(searchBox,"books");

		

		action.moveToElement(searchBox).click().sendKeys("books").doubleClick().perform();

		

		

		//we can do these steps separately as well



	//	action.moveToElement(searchBox).click().perform();

	//	wait(5);

	//	action.sendKeys("books").perform();

	//	wait(5);

	//	action.doubleClick().perform();

		

		

		tearDown();

	}
}
