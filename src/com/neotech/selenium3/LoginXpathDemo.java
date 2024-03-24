package com.neotech.selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathDemo {
public static final String url = "https://sis.neotechacademy.com/";
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		// 		/html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input
		
		
	//	driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]"
	//			+ "/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/input")).sendKeys("Admin");
		
		
		
		driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
		//if we use " " on the path
	//	driver.findElement(By.xpath("//*[@id=\"tUsername\"]")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@name='tPassword']")).sendKeys("Neotech$123");
		
		
		Thread.sleep(2000);
		
		//click on login:
			//possible paths:
				//   //*[@id="bLogin"]
				//   //input[@type="submit"]
				//	//input[@id='bLogin']  -- no different than the first
		
		driver.findElement(By.xpath("//input[@id='bLogin']")).click();
		
		
		Thread.sleep(2000);
		
		//tagname[function()]
			//tagname can be any tag: a, input, td, tr, table
			//function can by any xpath allowed function: contains, starts-with
		//ex: //a[contains(text(), 'Students')]

		//what is the difference between * and tagname
		//* means any 
		//when we have *, than is not specifying the tag, but it just says it can be any tag.
		driver.findElement(By.xpath("//a[contains(text(),'Students')]")).click();
		Thread.sleep(2000);
		
		driver.quit();

		
		
		
	}
	
	
	
	
}
