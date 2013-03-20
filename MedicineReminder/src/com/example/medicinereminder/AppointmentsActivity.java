package com.example.medicinereminder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class AppointmentsActivity extends Activity {
	
	public static final int SetRefillsActivity_ID= 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_appointments);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_appointments, menu);
		return true;
	}
	
	public void onAContinueButtonClick(View view){
		Intent i = new Intent(this, SetRefillsActivity.class);
		startActivityForResult(i, SetRefillsActivity_ID);
		
		
	}
	
}
