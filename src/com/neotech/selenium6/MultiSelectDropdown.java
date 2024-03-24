package com.neotech.selenium6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultiSelectDropdown extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement multiSelect = driver.findElement(By.id("multi-select"));

		Select sel = new Select(multiSelect);

		boolean isMlp = sel.isMultiple();
		System.out.println("is Multiple: " + isMlp);

		if (isMlp) {
			List<WebElement> options = sel.getOptions();
			for (WebElement el : options)

			{
				String text = el.getText();
				System.out.println("The visible text is: " + text);
				sel.selectByVisibleText(text);
				Thread.sleep(2000);
			}
			sel.deselectByIndex(0);
			Thread.sleep(2000);
			sel.deselectAll();
			Thread.sleep(2000);
		}

	}

}
