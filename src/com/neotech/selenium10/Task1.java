package com.neotech.selenium10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Task1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*Open chrome browser
		Go to https://hrm.neotechacademy.com/
		Login into the application
		Select Discipline
		Select Disciplinary Cases
		Click on Filter (Up-Right next to Help)
		Select from June 6, 2023 to July 15, 2023
		Click on Search
		Validate that there are no rows in result table
		Quit the browser*/

		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//login
		
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.
				getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.
				getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//navigate to disciplinary cases
		driver.findElement(By.id("menu_discipline_defaultDisciplinaryView")).click();
		driver.findElement(By.id("menu_discipline_viewDisciplinaryCases")).click();
		
		
		
		//notice we have a frame, you have to move to the frame
		driver.switchTo().frame("noncoreIframe"); //using name or id
	//	driver.switchTo().frame(0);  using index
		
		//click on filter
		driver.findElement(By.id("searchModal")).click();

		//click on the calendar		
		Thread.sleep(3000);
		
		driver.findElement(By.name("DisciplinaryCaseSearch[createdDateFrom]")).click();
		

		//click on the month and select July
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateFrom_root']//div[@class='select-wrapper picker__select--month']//input")).click();
		
		
		//click on July
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateFrom_root']//li/span[text()='September']")).click();
		
		//*[@id="DisciplinaryCaseSearch_createdDateFrom_root"]/div/div/div/div/div[2]/div/div[1]/select
		
		//click on year
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']/input")).click();

		//click on 2020
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//span[text()='2020']")).click();
				
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateFrom_table']/tbody/tr/td"));
		
		for (WebElement date : dates)
		{
			if(date.getText().equals("5"))
			{
				date.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		//click on the next calendar
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();
		
		//click on the month
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();
		
		//click august
		driver.findElement(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateTo_root\"]//li/span[text()='August']")).click();
		
		
		
		//click on year
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateTo_root']//div[@class='select-wrapper picker__select--year']//input")).click();

		//click on 2020
		driver.findElement(By.xpath("//*[@id='DisciplinaryCaseSearch_createdDateTo_root']//div[@class='select-wrapper picker__select--year']//span[text()='2022']")).click();
		
		
		List<WebElement> dates2 = driver.findElements(By.xpath("//*[@id=\"DisciplinaryCaseSearch_createdDateTo_table\"]/tbody/tr/td"));

		for (WebElement date : dates2)
		{
			if(date.getText().equals("5"))
			{
				date.click();
				break;
			}
		}
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(5000);
		tearDown();
		
	}
 

}
