package com.neotech.test;

import com.neotech.pages.DashboardPageUsingFactory;

import com.neotech.pages.LoginPageUsingFactory;

import com.neotech.utils.CommonMethods;

import com.neotech.utils.ConfigsReader;



public class LoginTestUsingFactory extends CommonMethods{



	public static void main(String[] args) {

		// https://hrm.neotechacademy.com/

		

		setUp();

		

		// At this point we are not locating the elements 

		// we are telling how the elements will be located 

		

		

		LoginPageUsingFactory login = new LoginPageUsingFactory();

		DashboardPageUsingFactory dashboard = new DashboardPageUsingFactory();

		

		// send username

		sendText(login.username, ConfigsReader.getProperty("username"));

		

		// send password

		sendText(login.password, ConfigsReader.getProperty("password"));

		

		// click the login button

		click(login.loginBtn);

		

		

		// Validate the logo after login

		if (dashboard.logo.isDisplayed()) {

			System.out.println("Test Passed!");

		}

		else {

			System.out.println("Test Failed!");

		}

		

		// Validate the account name = "Jacqueline White" 

		String expectedName = "Jacqueline White";

		String actualName = dashboard.name.getText();

		

		if (actualName.equals(expectedName))

		{

			System.out.println(expectedName + " is logged in.");

		}

		else 

		{

			System.out.println(expectedName + " is not logged in.");

			

		}

		

		

		wait(2);

		

		tearDown();


	}
}
