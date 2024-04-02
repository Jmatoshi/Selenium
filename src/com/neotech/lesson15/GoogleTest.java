package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class GoogleTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		WebElement searchBox = driver.findElement(By.name("q"));

		sendText(searchBox, "trabzonspor");

		wait(2);

		searchBox.sendKeys(Keys.ENTER);

		wait(2);

		tearDown();

	}

}
