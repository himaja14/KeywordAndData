package com.edureka.utilities;

import java.util.ArrayList;

/**
 * @author HimajaMadabhushi
 *
 */
public class TestScript {

	ArrayList<Row> script = new ArrayList<Row>();

	public void addRow(Row rowData) {
		this.script.add(rowData);
	}

	public Row getRow(int index){
		return this.script.get(index);
	}

	public int  size() {
		return this.script.size();
	}

}
