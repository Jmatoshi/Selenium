package com.neotech.selenium12;

import org.openqa.selenium.By;



import com.neotech.utils.CommonMethods;



public class Homework2 extends CommonMethods {



	public static void main(String[] args) {

		// WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java

		// https://accounts.google.com/signup

		

		setUp();

		

		System.out.println("Title -> " + driver.getTitle());

		

		wait(2);

		

		//not only click, but also wait for element to 

		//be clickable if necessary

		click(driver.findElement(By.linkText("Help")));

		

		wait(2);

		

		switchToChildWindow();

		

		System.out.println("The title of the child window is -> " + driver.getTitle());

		

		

		

		

		

		

		tearDown();

		
		
		

	}

}
