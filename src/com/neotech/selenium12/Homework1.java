package com.neotech.selenium12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	public static void main(String[] args) {
		// Homework 1:
		// FrameDemo at com.neotech.lesson07 using the CommonMethods.java
        // https://jqueryui.com/tooltip/

		setUp();

		switchToFrame(0);

		WebElement ageTxt = driver.findElement(By.id("age"));

		sendText(ageTxt, "30");

		wait(3);

		driver.switchTo().defaultContent();
		switchToFrame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		sendText(driver.findElement(By.id("age")), "25");

		tearDown();

	}

	
	

}
