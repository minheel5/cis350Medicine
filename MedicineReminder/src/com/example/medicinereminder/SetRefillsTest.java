package com.example.medicinereminder;


import com.example.medicinereminder.R;
import com.example.medicinereminder.SetRefillsActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.DatePicker;

public class SetRefillsTest extends ActivityInstrumentationTestCase2<SetRefillsActivity> {
	
	private String first_name = "";
	private String last_name = "";

	public SetRefillsTest(String name) {
		super(SetRefillsActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		SetRefillsActivity info = getActivity();
		DatePicker dpResult2 = (DatePicker) info.findViewById(R.id.dpResult2);
		
		
	}
	
	public void testDater(){
		assertEquals(first_name, "Minhee");
	}
	
	public void testHour(){
		assertEquals(last_name, "Lee");
	}
	
	

}