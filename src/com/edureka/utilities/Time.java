package com.edureka.utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * class to get execution Time
 * @author HimajaMadabhushi
 *
 */
public class Time {

	public String getTime() {
		Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH_mm_ss");
    	return sdf.format(cal.getTime());		
	}

}
