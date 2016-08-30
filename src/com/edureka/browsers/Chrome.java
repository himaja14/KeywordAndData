package com.edureka.browsers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * class to instantiate Chrome browser
 * @author HimajaMadabhushi
 *
 */
public class Chrome {

	/**
	 * This Method get the chrome driver and instantiate new chrome browser object
	 * @return driver object 
	 */
	public WebDriver getDriver() {

		File file = new File("driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
