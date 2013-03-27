package com.example.medicinereminder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class TakeOption extends Activity {
	public static final int SnoozeActivity_ID = 1;
	public static final int HomeScreen_ID = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_take_option);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_take_option, menu);
		return true;
	}
	
	public void onHomeButtonClick(View view){
		Intent i = new Intent(this, HomeScreen.class);
		startActivityForResult(i, HomeScreen_ID);
	}
	
	public void onTookButtonClick(View view){
		new AlertDialog.Builder(this).setTitle("Good Job :)").setMessage("Keep it up!").setNeutralButton("close",null).show();
		
		
	}
	
	public void onNotTakenButtonClick(View view){
		new AlertDialog.Builder(this).setTitle("Ok..:(").setMessage("You will do better next time.").setNeutralButton("close",null).show();
		
		
	}
	
	public void onAlarmButtonClick(View view){
		Intent i = new Intent(this, SnoozeActivity.class);
		startActivityForResult(i, SnoozeActivity_ID);
		
	}
}
