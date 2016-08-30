package com.edureka.testcase;

import java.util.ArrayList;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * class with selenium web elements and Actions methods
 * @author HimajaMadabhushi
 *
 */
public class SeleniumAction {

	private String object;
	private String value;
	private String property;
	private String action;
	WebDriver driver;
	
	/**
	 * This Method is creates instance method to current objects
	 * @param driver object value property action
	 */
	public SeleniumAction(WebDriver driver, String object, String value, String property, String action) {
		this.object = object; 
		this.value = value; 
		this.property = property; 
		this.action = action;
		this.driver = driver;
	}

	/**
	 * This Method performs all selenium actions 
	 * 
	 */
	public void perform() {
		WebElement webElement;
		switch(this.action){
		case "EnterText" :
			System.out.println("EnterText");
			webElement = findObject();
			webElement.sendKeys(this.value);
			break;
		case "Click" :
			System.out.println("Click");
			webElement = findObject();
			webElement.click();
			break;
			
		case "Select":
			System.out.println("Select");
			webElement = findObject();
			Select select = new Select(webElement);
			select.selectByVisibleText(this.value);
			break;
		case "NavigateBack":
			System.out.println("NavigateBack");
			driver.navigate().back();
			System.out.println("navigated "+driver.getCurrentUrl());
			break;
		case "HandleWindow":
			System.out.println("HandleWindow");
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
			break;
		
		default :
			System.out.println("No Action Found;");
		}

	}

	/**
	 * This Method used to find objects using xpath, name, text, id
	 */
	public WebElement findObject() {
		String[] properties = this.property.split(" = ");
		String attribute = properties[0].trim();
		
		String attributeValue = properties[1].trim();
		
		StringTokenizer token = new StringTokenizer(attributeValue, ":");
		attributeValue = token.nextToken().trim();
		while(token.hasMoreTokens()){			
			this.driver.switchTo().frame(token.nextToken().trim());
		}
		WebElement webElement = null;
		switch (attribute) {
		case "name" :
			webElement = this.driver.findElement(By.name(attributeValue));
			break;
		case "id" :
			webElement = this.driver.findElement(By.id(attributeValue));
			break;
		case "text" :
			webElement = this.driver.findElement(By.linkText(attributeValue));
			break;
		case "xpath" :
			webElement = this.driver.findElement(By.xpath(attributeValue));
			break;
		}
		return webElement;
	}

}
