package com.edureka.utilities;

import java.util.ArrayList;


/**
 * class with getter and setter for variables and Values
 * @author HimajaMadabhushi
 *
 */
public class Configuration {
	
	ArrayList<String> variables = new ArrayList<>();
	ArrayList<String> values = new ArrayList<>();

	public void setSettings(String cellData) {
		this.variables.add(cellData);
		
	}

	public void setValue(String cellData) {
		this.values.add(cellData);
		
	}

	public String getValueOf(String testCase) {
		int index = this.variables.indexOf(testCase);
		return this.values.get(index);
	}

}
