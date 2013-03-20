package com.example.medicinereminder;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class SetRefillsActivity extends Activity {
		public static final int Avatar_ID = 1;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_set_refills);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_set_refills, menu);
			return true;
		}
		
		public void onRefillContinueButtonClick(View view){
			Intent i = new Intent(this, Avatar.class);
			startActivityForResult(i, Avatar_ID);
		}

}
