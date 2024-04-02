package com.neotech.lesson15;

import com.neotech.pages.LambdaRegisterPage;

import com.neotech.utils.CommonMethods;



public class LambdaTest extends CommonMethods {



	public static void main(String[] args) {

		/*

		 * Go to https://accounts.lambdatest.com/register 

		 * Find the Password Element and enter a password 

		 * Find the Show span as a nephew of the password element and click on it 

		 * Find the Business Email as a cousin of the password element and enter an email 

		 * Close the browser

		 */



		setUp();

		

		LambdaRegisterPage register = new LambdaRegisterPage();

		

		

		sendText(register.passwordBox,"test123");

		

		jsClick(register.show);

		

		wait(3);

		

		sendText(register.businessEmail, "test123@gmail.com");

		

		wait(3);

		

		tearDown();

} }
