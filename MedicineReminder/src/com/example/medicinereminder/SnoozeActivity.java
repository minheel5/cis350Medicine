package com.example.medicinereminder;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class SnoozeActivity extends Activity {
	
	public static final int TakeOption_ID = 1;
	private int mins = 0;
	private Database data = Database.getInstance();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_snooze);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_snooze, menu);
		return true;
	}
	
	public void onRMContinueButtonClick(View view){
		EditText time = (EditText)findViewById(R.id.editText2);
		try {
			mins = Integer.parseInt(time.getText().toString());
		}
		catch (Exception e){
			new AlertDialog.Builder(this).setTitle("Error").setMessage("Please enter a number").setNeutralButton("close",null).show();
			return;
		}
		
		data.snoozeTime = mins;
		
		
		Intent i = new Intent(this, TakeOption.class);
		startActivityForResult(i, TakeOption_ID);
	}

}
