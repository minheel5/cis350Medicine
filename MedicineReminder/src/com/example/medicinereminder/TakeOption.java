package com.example.medicinereminder;

import java.io.File;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class TakeOption extends Activity {
	public static final int SnoozeActivity_ID = 1;
	public static final int HomeScreen_ID = 1;
	private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
	private Uri imageUri;
	private Database data = Database.getInstance();
	
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
	
	public void onPillCamButtonClick(View view){
	/*	String fileName = "new-photo-name.jpg";
		ContentValues values = new ContentValues();
		values.put(MediaStore.Images.Media.TITLE, fileName);
		values.put(MediaStore.Images.Media.DESCRIPTION,"Image capture by camera");
		imageUri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
		intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
		startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
	*/
		
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		File file = new File(Environment.getExternalStorageDirectory(), "test.jpg");
 
		imageUri = Uri.fromFile(file);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
		startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
    
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {
		    if (resultCode == RESULT_OK) {
		    
		 
		    } else if (resultCode == RESULT_CANCELED) {
		        Toast.makeText(this, "Picture was not taken", Toast.LENGTH_SHORT).show();
		    } else {
		        Toast.makeText(this, "Picture was not taken", Toast.LENGTH_SHORT).show();
		    }
		}
		}
	
}
