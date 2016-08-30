package com.edureka.utilities;

import java.util.ArrayList;

/**
* class to read configurations from Excel sheet
 * @author HimajaMadabhushi
 *
 */
public class Settings {

	public Configuration setSeleniumSettings(Outcome outcome) {
		ArrayList<TestScript> scripts = outcome.getScript();

		TestScript seleniumConfiguration = scripts.get(0);
		Row row;
		
		Configuration configuration = new Configuration();
		
		for(int j = 0 ; j < seleniumConfiguration.size(); j ++) {
			row = seleniumConfiguration.getRow(j);
			configuration.setSettings(row.getCellData(0));
			configuration.setValue(row.getCellData(1));
		}
		
		return configuration;
	}

}
