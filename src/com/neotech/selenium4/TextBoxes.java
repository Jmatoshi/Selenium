package com.neotech.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

public static String url="https://fs2.formsite.com/meherpavan/form2/index.html";
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		
		//1st way - we can locate the elements multiple times
		
		driver.findElement(By.cssSelector("#RESULT_TextField-1")).sendKeys("Engin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Mucteba");
		
		Thread.sleep(2000);
		
		//2nd way - avoid code redundancy
			//code reusability
		WebElement lastName = driver.findElement(By.id("RESULT_TextField-2"));
		lastName.clear();
		lastName.sendKeys("Yuksel");
		
		WebElement phone = driver.findElement(By.cssSelector("input#RESULT_TextField-3"));
		phone.sendKeys("456-3445-232");
		phone.clear();
		Thread.sleep(500);
		phone.sendKeys("123-234-2343");
		Thread.sleep(500);
		
		//Getting the value of an attribute
		String maxLength = phone.getAttribute("maxlength");
		System.out.println("The maxLength is: " + maxLength);
		
		
		WebElement country = driver.findElement(By.name("RESULT_TextField-4"));
		String countryClass = country.getAttribute("class");
		System.out.println("The class attribute value of the country is: " + countryClass);
		
		
		//Getting the text inside the WebElement
		String text = driver.findElement(By.xpath("//div[@id='q19']//h1")).getText();
		System.out.println("The header text is: " + text);
		
		
		
		driver.quit();
		
	}
	
	
	
}
