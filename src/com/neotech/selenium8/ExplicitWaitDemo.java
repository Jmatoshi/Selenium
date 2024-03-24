package com.neotech.selenium8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		//https://webdriveruniversity.com/Ajax-Loader/index.html
		
		setUp();
		
		// Let's create a WebDriverWait object and define its max wait time 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// We need to define the condition(s) for which the element will wait
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("button1"))));
		
		WebElement span = driver.findElement(By.id("button1"));
		
		// With method chaining 
		//System.out.println("span is visible: " + driver.findElement(By.id("button1")).isDisplayed());
		System.out.println("span is visible: "  + span.isDisplayed());
		
		Thread.sleep(3000);
		
		tearDown();

	} }