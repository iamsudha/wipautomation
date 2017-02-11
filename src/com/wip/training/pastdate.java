package com.wip.automation.exercise4;

import java.util.Calendar;
import java.util.Date;

public class pastdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.FEBRUARY, 10); // Year, month and day of month
		Date date = cal.getTime();
		System.out.println(date);
		
		
		Calendar cal2 = Calendar.getInstance(); // The current date
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Date date2 = cal2.getTime(); 
		System.out.println(date2);
	}

}
