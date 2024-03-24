package com.neotech.selenium9;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://demo.seleniumeasy.com/table-search-filter-demo.html
		
		
		setUp();
		
		System.out.println("----------------TABLE HEADER-------------");
		
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		
		Iterator<WebElement> it = headerData.iterator();
		
		while(it.hasNext())
		{
			String text = it.next().getText();
			System.out.print(text  + " | ");
		}
		System.out.println();
		
		
		//we can get the number of rows in a table
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']//tr"));
		
		System.out.println("The number of rows is: " + rows.size());
		
		
		//What would this do???
		System.out.println(rows.get(0).getText()); 
		
		System.out.println("----------------------TABLE DATA---------------");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td"));

		for (WebElement data : rowData)
		{
			System.out.println(data.getText());
		}
		
		
		
		tearDown();

	}
	
	
	
}
