package com.edureka.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.utilities.Configuration;
import com.edureka.utilities.Excel;
import com.edureka.utilities.Execution;
import com.edureka.utilities.Outcome;
import com.edureka.utilities.Settings;

/**
 * class to Execute the Framework with file path, Browser and URL
 * @author HimajaMadabhushi
 *
 */
public class ExecutionTest {

	@Test
	public void executeTestScriptReturnTrueIfCompleted() throws Exception {
		
		String filePath = "C:\\workspaces\\Selenium Project\\TestScript.xlsx";
		
		Excel excel = new Excel( filePath );
		
		Outcome configurationDetails = excel.getconfiguration();
		
		Settings settings = new Settings();
		Configuration configuration = settings.setSeleniumSettings(configurationDetails);
		
		String testCases = configuration.getValueOf("TestCase");
		String url = configuration.getValueOf("URL");
		String browser = configuration.getValueOf("Browser");

		Outcome outcome = excel.getScript(testCases);
		
		Execution execution = new Execution( url, browser, filePath );
		execution.startBrowser();
		Assert.assertTrue(execution.run( outcome ));
		
		execution.driver.quit();
	}
}
