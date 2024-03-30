package com.neotech.test;

import javax.security.auth.login.LoginContext;

import com.neotech.pages.DashboardPage;

import com.neotech.pages.LoginPage;

import com.neotech.utils.CommonMethods;

import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {

		// https://hrm.neotechacademy.com/

		setUp();

		// locate the username

		LoginPage login = new LoginPage();

		// let's send the username

		sendText(login.username, ConfigsReader.getProperty("username"));

		// let's send the password

		sendText(login.password, ConfigsReader.getProperty("password"));

		// let's click the login button

		login.loginBtn.click();

		// you can use this style too

		// click(login.loginBtn);

		wait(3);

		DashboardPage dashboard = new DashboardPage();

		// let's validate if the logo is diplayed

		if (dashboard.logo.isDisplayed())

		{

			System.out.println("Test Passed!");

		}

		else

		{

			System.out.println("Test Failed");

		}

		// let's validate that "Jacqueline White" is logged in

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