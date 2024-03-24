package com.neotech.selenium9;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		//Homework 2: Same as Homework1 -> Use FluentWait

		
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		//click on Enable
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();
		
		
		//we will use FluentWait
		
		
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(10));
		fluentWait.pollingEvery(Duration.ofSeconds(2));
		
		//you might see differences in default setting of FluentWait and WebDriverWait
			//ex: FluentWait will not save you from a NoSuchElementException
		fluentWait.ignoring(NoSuchElementException.class);
		
		
		WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/input"));
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(textBox));
		
		
		textBox.sendKeys("BATU!!!");
		
		
		tearDown();
	
}
}
