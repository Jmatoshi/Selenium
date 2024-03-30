package com.neotech.lesson15;

import org.openqa.selenium.WebElement;

import com.neotech.pages.LoginPageUsingFactory;

import com.neotech.utils.CommonMethods;

import com.neotech.utils.ConfigsReader;



public class Homework1 extends CommonMethods{



	public static void main(String[] args) {



		/*

		 * TC 1: Orange HRM blank password validation

			1. Go to https://hrm.neotechacademy.com/

			2. Enter valid username and leave password field empty

			3. Click on login button

			4. Verify error message with text "Password cannot be empty" is displayed

		 */



		setUp();

		

		LoginPageUsingFactory loginPage = new LoginPageUsingFactory();

		

		sendText(loginPage.username, 

				ConfigsReader.getProperty("username"));

		

		wait(2);

		

		click(loginPage.loginBtn);

		

		wait(2);

		

		//check if the error is showing

		

		String expectedString = "Password cannot be empty";

		String actualString = ((WebElement) loginPage.passwordError).getText();

		

		if(expectedString.equals(actualString))

		{

			System.out.println("Test Passed!");

		}

		else

		{

			System.out.println("Test Failed!");

		}

		

		tearDown();
	}

}
