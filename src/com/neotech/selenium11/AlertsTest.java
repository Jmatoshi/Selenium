package com.neotech.selenium11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class AlertsTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//https://demo.guru99.com/test/delete_customer.php	
		
		
		setUp();
		
		sendText(driver.findElement(By.name("cusid")), "1234");

		driver.findElement(By.name("submit")).click();

		

		wait(2);

		

		System.out.println(getAlertText());

		

		wait(2);

		

		dismissAlert();

		

		driver.findElement(By.name("submit")).click();

		acceptAlert();

		

		wait(1);

		

		tearDown();

	
		

	}

}
