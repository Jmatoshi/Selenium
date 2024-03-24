package com.neotech.selenium4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

public static String url="https://fs2.formsite.com/meherpavan/form2/index.html";
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		
		WebElement maleRB = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
		maleRB.click();
		Thread.sleep(2000);
		
		//method chaining
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		

		WebElement wednesdayCB = driver.findElement(By.cssSelector("label[for='RESULT_CheckBox-8_3']"));
		wednesdayCB.click();
		Thread.sleep(2000);
		
		
		//findElement --> will always return an element
		
		//findElements --> will return a List<WebElements> 
		//In this example, we located 9 elements
		
		List<WebElement> elements = 
				driver.findElements(By.xpath("//table[@class='inline_grid choices']/tbody/tr/td/label"));
		
		//I want to click on the Female radio button and on the Saturday check box
		
		for (WebElement el : elements)
		{
			String text = el.getText();
			
			if (text.equals("Female"))
			{
				el.click();
			}
			else if (text.equals("Saturday"))
			{
				el.click();
			}
			else if (text.equals("Sunday"))
			{
				el.click();
			}
			//if I want to do else here
			else 
			{
				System.out.println("I dont want to click on " + text);
			}
			
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		driver.quit();
	}
	
	
	
}
