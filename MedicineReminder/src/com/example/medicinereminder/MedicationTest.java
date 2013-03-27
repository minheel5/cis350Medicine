package com.example.medicinereminder;

import static org.junit.Assert.*;

import org.junit.Test;


public class MedicationTest {
	
	private Database data = Database.getInstance();
	private String medication1 = "";
	private String medication2 = "";
	private String medication3 = "";
	private Time time1 = null;
	private Time time2 = null;
	
	public MedicationTest(String name) {
		super();
	}

	protected void setUp() throws Exception {
		medication1 = data.medication1;
		medication2 = data.medication2;
		medication3 = data.medication3;
		time1 = data.medicationTime1;
		time2 = data.medicationTime2;
	}
	
	@Test
	public void testMedications(){
		assertEquals(medication1, "");
		assertEquals(medication2, "");
		assertEquals(medication3, "");
	}
	
	@Test
	public void testMedicationTime(){
		assertEquals(time1, null);
		assertEquals(time2, null);
	}
	
	

}