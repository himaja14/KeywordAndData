package com.edureka.browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	/**
	 * class to instantiate Firefox browser
	 * @author HimajaMadabhushi
	 *
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Wait for the object to come
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		//Close the browser
		driver.close();

	}
}
