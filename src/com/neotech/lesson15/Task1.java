package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods{

	private static final String TAB = null;

	public static void main(String[] args) {
		//Go to https://the-internet.herokuapp.com/key_presses
				//Press on ESC, TAB, and ENTER.
		
		setUp();

		WebElement searchBox = driver.findElement(By.id("target"));

		wait(2);
		
		searchBox.sendKeys(Keys.ESCAPE);
		
		wait(2);
		
		sendText(searchBox, TAB);
		
		wait(2);

		searchBox.sendKeys(Keys.ENTER);
		
		wait(2);
		
	//	searchBox.sendKeys(Keys.TAB.ESCAPE.SHIFT.ENTER);
		
		
	//after pressing ENTER the page will reload,so the other commands might not work	
	//	searchBox.sendKeys(KEYS.ALT.F4);

		wait(2);

		tearDown();
		
		
		
	}

}
