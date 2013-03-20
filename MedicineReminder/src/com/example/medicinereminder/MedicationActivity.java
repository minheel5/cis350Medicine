package com.example.medicinereminder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MedicationActivity extends Activity {
	public static final int ReminderTimeActivity_ID = 1;
	private String[] medication = {"",""};
	private String[] time = {"",""};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_medication);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_medication, menu);
		return true;
	}
	
	public void onMContinueButtonClick(View view){
		EditText e1 = (EditText)findViewById(R.id.editText3);
		medication[0] = e1.getText().toString();
		Log.i("Info", medication[0]);
		
		EditText e2 = (EditText)findViewById(R.id.editText4);
		medication[1] = e2.getText().toString();
		Log.i("Info", medication[1]);
		
		EditText e3 = (EditText)findViewById(R.id.editText1);
		time[0] = e3.getText().toString();
		Log.i("Info", time[0]);
		
		EditText e4 = (EditText)findViewById(R.id.editText2);
		time[1] = e4.getText().toString();
		Log.i("Info", time[1]);
		
		Intent i = new Intent(this, ReminderTimeActivity.class);
		startActivityForResult(i, ReminderTimeActivity_ID);
	}

}
