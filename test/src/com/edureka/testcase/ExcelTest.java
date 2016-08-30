package com.edureka.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.utilities.Excel;
import com.edureka.utilities.Outcome;

/**
 * test class to read Data Excel sheet
 * @author HimajaMadabhushi
 *
 */
public class ExcelTest {

	@Test
	public void getTestCaseDataFromExcel() {
		String filePath = "C:\\workspaces\\Selenium Project\\KeywordAndData\\TestScript.xlsx";
		Excel excel = new Excel( filePath );
		Outcome outcome = excel.getScript("Facebook");
		Assert.assertTrue(outcome.isSuccessful());
	}


	@Test
	public void getConfiguration(){
		String filePath = "C:\\workspaces\\Selenium Project\\KeywordAndData\\TestScript.xlsx";
		Excel excel = new Excel( filePath );
		Outcome outcome = excel.getconfiguration();
		Assert.assertTrue(outcome.isSuccessful());
	}
}
