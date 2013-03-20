package com.example.medicinereminder;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Avatar extends Activity {
	public static final int Tutorial_ID = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_avatar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_avatar, menu);
		return true;
	}
	
	public void onAvatarContinueButtonClick(View view){
		Intent i = new Intent(this, Tutorial.class);
		startActivityForResult(i, Tutorial_ID);
		
		
	}

}
