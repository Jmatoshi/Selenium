package com.neotech.selenium13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods{

	public static void main(String[] args) {
		/*Open chrome browser
		Go to https://demo.guru99.com/test/drag_drop.html
			Drag the following blocks in different ways
			Drag BANK to DEBIT SIDE
			Drag SALES to CREDIT SIDE
			Drag 5000 to DEBIT SIDE
			Drag 5000 to CREDIT SIDE
			Close the browser */
		
		
		
		setUp ();
		
		Actions act = new Actions(driver);
		
		//Drag BANK to DEBIT SIDE
		
		WebElement bank = driver.findElement(By.xpath("//li[@id ='credit2']/a"));
		WebElement debit1= driver.findElement(By.xpath("//ol[@id ='bank']/li"));
		act.dragAndDrop(bank, debit1).perform();
		wait(3);
		
		
		// Drag SALES to CREDIT SIDE
		
		WebElement sales = driver.findElement(By.xpath("//li[@id ='credit1']/a"));
		WebElement credit1= driver.findElement(By.xpath("//ol[@id ='loan']/li"));
		act.dragAndDrop(sales, credit1).perform();
		wait(3);
		
	//	Drag 5000 to DEBIT SIDE
		
		WebElement fiveThousand = driver.findElement(By.xpath("//li[@id ='fourth']/a"));
		WebElement credit2= driver.findElement(By.xpath("//ol[@id ='amt7']/li"));
		act.dragAndDrop(fiveThousand, credit2).perform();
		wait(3);
		
	//		Drag 5000 to CREDIT SIDE
		
		WebElement fiveThousand1 = driver.findElement(By.xpath("//li[@id ='fourth']/a"));
		WebElement credit3= driver.findElement(By.xpath("//ol[@id ='amt8']/li"));
		act.dragAndDrop(fiveThousand1, credit3).perform();
		wait(3);	
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/homework1.png");

		try {
			Files.copy(source, destination);
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot!");
			e.printStackTrace();
		}
		
		
		wait(3);
		
		
		tearDown();
	

} }
