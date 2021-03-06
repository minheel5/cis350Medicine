package com.example.medicinereminder;

import static org.junit.Assert.*;

import org.junit.Test;


public class SetRefillsTest {
	
	private Database data = Database.getInstance();
	private int year = 0;
	private int month = 0;
	private int day = 0;
	
	public SetRefillsTest(String name) {
		super();
	}

	protected void setUp() throws Exception {
		day = data.appointmentsDay;
		month = data.appointmentsMonth;
		year = data.appointmentsYear;
	}
	
	@Test
	public void testDate(){
		assertEquals(day, 04);
		assertEquals(month, 04);
		assertEquals(year, 2013);
	}
	
	
	

}