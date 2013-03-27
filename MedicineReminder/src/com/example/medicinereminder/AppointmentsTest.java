package com.example.medicinereminder;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppointmentsTest {
	
	private Database data = Database.getInstance();
	private int year = 0;
	private int month = 0;
	private int day = 0;
	private Time time = null;
	
	public AppointmentsTest(String name) {
		super();
	}

	protected void setUp() throws Exception {
		day = data.appointmentsDay;
		month = data.appointmentsMonth;
		year = data.appointmentsYear;
		time = data.appointmentsTime;
	}
	
	@Test
	public void testDate(){
		assertEquals(day, 0);
		assertEquals(month, 0);
		assertEquals(year, 0);
	}
	
	@Test
	public void testHour(){
		assertEquals(time, null);
	}
	
	

}
