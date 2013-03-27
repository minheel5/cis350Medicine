package com.example.medicinereminder;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
	public static final int UserInfoActivity_ID = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			
			//this is where notification edits begin
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.HOUR_OF_DAY, 5);
			cal.set(Calendar.MINUTE, 19);
			cal.set(Calendar.SECOND, 05);
			
			Intent intent = new Intent(this, Mote.class);
			PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 1253, intent, PendingIntent.FLAG_UPDATE_CURRENT| Intent.FILL_IN_DATA);
			
			AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
			
			alarmManager.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
			Toast.makeText(this, "Alarm worked.", Toast.LENGTH_LONG).show();
			//this is where notification edits end
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_main, menu);
			return true;
	}

	public void onStartButtonClick(View view){
		Intent i = new Intent(this, UserInfoActivity.class);
		startActivityForResult(i, UserInfoActivity_ID);
	}
	
}


