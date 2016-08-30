package com.edureka.browsers;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * class to instantiate IE browser
 * @author HimajaMadabhushi
 *
 */
public class IE {

	/**
	 * This Method get the IE driver and instantiate new IE browser object
	 * @return driver object 
	 */
	public WebDriver getDriver() {

		File file = new File("driver/IEDriverServer.exe");		
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		return driver;
	}

}
