package com.neotech.selenium11;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;



import com.neotech.utils.CommonMethods;



public class FacebookSignUp extends CommonMethods{



	public static void main(String[] args) throws InterruptedException {

		// https://www.facebook.com/r.php

		

		setUp();

		

		WebElement day = driver.findElement(By.id("day"));

		selectDropdown(day, 25);

		wait(2);

		

		WebElement month = driver.findElement(By.id("month"));

		selectDropdown(month, "Dec");

		wait(2);

		

		WebElement year = driver.findElement(By.id("year"));

		selectDropdown(year, "2000");

		wait(2);

		

		tearDown();
		
		
		
		
	}}