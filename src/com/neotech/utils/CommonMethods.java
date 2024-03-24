package com.neotech.utils;

import java.time.Duration;

import java.util.List;

import java.util.Set;



import org.openqa.selenium.Alert;

import org.openqa.selenium.NoAlertPresentException;

import org.openqa.selenium.NoSuchFrameException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;



public class CommonMethods extends BaseClass{

	

	/**

	 * This method clears a text box and sets its text

	 * 

	 * @param element

	 * @param text

	 */

	public static void sendText(WebElement element, String text) {

		element.clear();

		element.sendKeys(text);

	}

	

	/**

	 * This methods checks if the radio/check box is enabled, and then clicks on

	 * the element that matches the selected value

	 * @param elementList

	 * @param selectValue

	 */

	public static void clickRadioOrCheckbox(List<WebElement> elementList, String selectValue) {

		for (WebElement el : elementList) {

			String elementValue = el.getAttribute("value").trim();

			

			if (elementValue.equals(selectValue) && el.isEnabled()) {

				el.click();

				break;

			}

		}

	}

	

	/**

	 * This method pauses the execution for a certain amount of seconds

	 * @param seconds

	 */

	public static void wait(int seconds) {

		

		try {

			Thread.sleep(seconds * 1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method checks if a visible text is found in a drop down and selects it

	 * 

	 * @param element

	 * @param visibleText

	 */

	public static void selectDropdown(WebElement element, String visibleText) {

		try {

			Select sel = new Select(element);

			sel.selectByVisibleText(visibleText);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method checks if a given index is valid and selects it

	 * if so

	 * @param element

	 * @param index

	 */

	public static void selectDropdown(WebElement element, int index) {

		try {

			Select sel = new Select(element);

			sel.selectByIndex(index);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method switches the focus to an Alert and accepts if found

	 * if not found, NoAlertPresentException is thrown

	 */

	public static void acceptAlert() {

		try {

			Alert alert = driver.switchTo().alert();

			alert.accept();

		} catch (NoAlertPresentException e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method dismisses an alert if it's present

	 * if not present, an exception will be thrown

	 */

	public static void dismissAlert() {

		try {

			Alert alert = driver.switchTo().alert();

			alert.dismiss();

		} catch (NoAlertPresentException e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method will return the alert text if the alert present

	 * if not, null will be returned 

	 * @return

	 */

	public static String getAlertText() {

		String alertText = null;

		

		try {

			Alert alert = driver.switchTo().alert();

			alertText = alert.getText();

		} catch (NoAlertPresentException e) {

			e.printStackTrace();

		}

		

		return alertText;

	}

	

	/**

	 * This method sends a text to the alert if present

	 * @param text

	 */

	public static void sendAlertText(String text) {

		

		try {

			Alert alert = driver.switchTo().alert();

			alert.sendKeys(text);

		} catch (NoAlertPresentException e) {

			e.printStackTrace();

		}

		

	}

	/**

	 * This method switches to a frame using name or id

	 * @param nameOrId

	 */

	public static void switchToFrame(String nameOrId) {

		try {

			driver.switchTo().frame(nameOrId);

			

		} catch (NoSuchFrameException e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method switches to a frame using index

	 * @param index

	 */

	public static void switchToFrame(int index) {

		try {

			driver.switchTo().frame(index);

			

		} catch (NoSuchFrameException e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method switches to a frame using a WebElement

	 * @param element

	 */

	public static void switchToFrame(WebElement element) {

		try {

			driver.switchTo().frame(element);

			

		} catch (NoSuchFrameException e) {

			e.printStackTrace();

		}

	}

	

	/**

	 * This method switches the focus to a child window

	 */

	public static void switchToChildWindow() {

		String mainWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		

		for (String handle : handles) {

			if (!mainWindow.equals(handle)) {

				driver.switchTo().window(handle);

			}

		}

	}

	

	/**

	 * This method creates and returns a wait object

	 * @return

	 */

	public static WebDriverWait getWaitObject() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

		return wait;

	}

	

	/**

	 * This method creates a wait object based on a provided seconds to wait

	 * @param secondsToWait

	 * @return

	 */

	public static WebDriverWait getWaitObject(int secondsToWait) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));

		return wait;

	}

	

	public static WebElement waitForClickability(WebElement element) {

		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));

	}

	/**

	 * waits for the element to be visible

	 * @param element

	 * @return

	 */

	public static WebElement waitForVisibility(WebElement element) {

		return getWaitObject().until(ExpectedConditions.visibilityOf(element));

	}

	

	public static void click(WebElement element) {

		waitForClickability(element);

		element.click();

	}
}
	