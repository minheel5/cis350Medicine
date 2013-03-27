package com.example.medicinereminder;

import com.example.medicinereminder.R;
import com.example.medicinereminder.SnoozeActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class SnoozeTest extends ActivityInstrumentationTestCase2<SnoozeActivity> {
	
	private String first_name = "";
	private String last_name = "";

	public SnoozeTest(String name) {
		super(SnoozeActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		SnoozeActivity info = getActivity();
		DatePicker dpResult = (DatePicker) info.findViewById(R.id.dpResult);
		TimePicker timePicker2 = (TimePicker) info.findViewById(R.id.timePicker2);
		
		
	}
	
	public void testDater(){
		assertEquals(first_name, "Minhee");
	}
	
	public void testHour(){
		assertEquals(last_name, "Lee");
	}
	
	

}