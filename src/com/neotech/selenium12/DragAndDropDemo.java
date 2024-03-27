package com.neotech.selenium12;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;



import com.neotech.utils.CommonMethods;



public class DragAndDropDemo extends CommonMethods {



	public static void main(String[] args) {

		// https://jqueryui.com/droppable/

		

		

		setUp();

		

		switchToFrame(0);

		

		wait(5);

		

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		

		Actions action = new Actions(driver);

		

		action.dragAndDrop(drag, drop).perform();

		

		wait(5);

		

		

		//another way to do the same thing

		

	//	action.clickAndHold(drag).moveToElement(drop).release().perform();

		

		

		

		

		tearDown();

	}

}
