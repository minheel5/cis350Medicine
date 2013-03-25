package com.example.medicinereminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class HomeScreen extends Activity {

	public static final int UserInfoActivity_ID = 1;
	public static final int TakeOptionActivity_ID = 1;
	public static final int CheckProgressActivity_ID = 1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_home_screen, menu);
		return true;
	}
	
	public void onEditInformationClick(View view){
		Intent i = new Intent(this, UserInfoActivity.class);
		startActivityForResult(i, UserInfoActivity_ID);
	}
	
	public void onCheckProgressClick(View view){
	}
	
	public void onTakeMedsClick(View view){
		Intent i = new Intent(this, TakeOption.class);
		startActivityForResult(i, TakeOptionActivity_ID);
	}

}