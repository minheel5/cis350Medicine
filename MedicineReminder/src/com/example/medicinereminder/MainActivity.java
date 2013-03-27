package com.example.medicinereminder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {
	public static final int UserInfoActivity_ID = 1;
	private SharedPreferences mPreferences;
	boolean firstTime = mPreferences.getBoolean("firstTime", true);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	/*	if (firstTime){
			SharedPreferences.Editor editor = mPreferences.edit();
			editor.putBoolean("firstTime", false);
			editor.commit();*/
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
		/*}
		else{ 
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_home_screen);
		}*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		/*if (firstTime){
			SharedPreferences.Editor editor = mPreferences.edit();
			editor.commit();*/
			getMenuInflater().inflate(R.menu.activity_main, menu);
			return true;
		/*}
		else{ 
			getMenuInflater().inflate(R.menu.activity_home_screen, menu);
			return true;
		}*/
	}

	public void onStartButtonClick(View view){
		Intent i = new Intent(this, UserInfoActivity.class);
		startActivityForResult(i, UserInfoActivity_ID);
	}
	
}


