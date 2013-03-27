package com.example.medicinereminder;

import com.example.medicinereminder.R;
import com.example.medicinereminder.UserInfoActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class UserInfoTest extends ActivityInstrumentationTestCase2<UserInfoActivity> {
	
	private String first_name = "";
	private String last_name = "";
	private String dateOfDiagnosis = "";
	private String viralLoad = "";
	private String phone = "";
	private String providerPhone = "";

	public UserInfoTest(String name) {
		super(UserInfoActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		UserInfoActivity info = getActivity();
		EditText e1 = (EditText)info.findViewById(R.id.editText1);
		first_name = e1.getText().toString();
		
		EditText e2 = (EditText)info.findViewById(R.id.editText2);
		last_name = e2.getText().toString();
		
		EditText e3 = (EditText)info.findViewById(R.id.editText3);
		dateOfDiagnosis = e3.getText().toString();
		
		EditText e4 = (EditText)info.findViewById(R.id.editText4);
		viralLoad = e4.getText().toString();
		
		EditText e5 = (EditText)info.findViewById(R.id.editText5);
		phone = e5.getText().toString();
		
		EditText e6 = (EditText)info.findViewById(R.id.editText6);
		providerPhone = e6.getText().toString();
		
	}
	
	public void testFirstName(){
		assertEquals(first_name, "Minhee");
	}
	
	public void testLastName(){
		assertEquals(last_name, "Lee");
	}
	
	public void testDate(){
		assertEquals(dateOfDiagnosis, "2/27/13");
	}
	
	public void testViralLoad(){
		assertEquals(viralLoad, "100");
	}
	
	public void testPhone(){
		assertEquals(phone, "215-588-7785");
	}
	
	public void testProviderPhone(){
		assertEquals(providerPhone, "267-709-4301");
	}
	

}
