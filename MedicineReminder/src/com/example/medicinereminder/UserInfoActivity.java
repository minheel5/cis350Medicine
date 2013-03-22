package com.example.medicinereminder;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class UserInfoActivity extends Activity {
	
	public static final int MedicationActivity_ID = 1;
	private String first_name = "";
	private String last_name = "";
	private String dateOfDiagnosis = "";
	private String viralLoad = "";
	private String phone = "";
	private String providerPhone = "";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_info);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_user_info, menu);
		return true;
	}
	
	public void onContinueButtonClick(View view){
		EditText e1 = (EditText)findViewById(R.id.editText1);
		first_name = e1.getText().toString();
		Log.i("Info", first_name);
		
		EditText e2 = (EditText)findViewById(R.id.editText2);
		last_name = e2.getText().toString();
		Log.i("Info", last_name);
		
		EditText e3 = (EditText)findViewById(R.id.editText3);
		dateOfDiagnosis = e3.getText().toString();
		Log.i("Info", dateOfDiagnosis);
		
		EditText e4 = (EditText)findViewById(R.id.editText4);
		viralLoad = e4.getText().toString();
		Log.i("Info", viralLoad);
		
		EditText e5 = (EditText)findViewById(R.id.editText5);
		phone = e5.getText().toString();
		Log.i("Info", phone);
		
		EditText e6 = (EditText)findViewById(R.id.editText6);
		providerPhone = e6.getText().toString();
		Log.i("Info", providerPhone);
		
		if (first_name.equals("")){
			new AlertDialog.Builder(this).setTitle("Error").setMessage("You cannot leave any fields blank").setNeutralButton("close",null).show();
		}
		else if (last_name.equals("")){
			new AlertDialog.Builder(this).setTitle("Error").setMessage("You cannot leave any fields blank").setNeutralButton("close",null).show();
		}
		else if (dateOfDiagnosis.equals("") || dateOfDiagnosis.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}")){
			new AlertDialog.Builder(this).setTitle("Error").setMessage("You cannot leave any fields blank").setNeutralButton("close",null).show();
		}
		else if (viralLoad.equals("")){
			new AlertDialog.Builder(this).setTitle("Error").setMessage("You cannot leave any fields blank").setNeutralButton("close",null).show();
		}
		else if (phone.equals("") || !phone.matches("(\\d{3}-?){1,2}\\d{4}")){
			new AlertDialog.Builder(this).setTitle("Error").setMessage("Please enter a valid phone number").setNeutralButton("close",null).show();
		}
		else if (providerPhone.equals("") || !providerPhone.matches("(\\d{3}-?){1,2}\\d{4}")){
			new AlertDialog.Builder(this).setTitle("Error").setMessage("Please enter a valid provider phone number").setNeutralButton("close",null).show();
		}
		else{
			Intent i = new Intent(this, MedicationActivity.class);
			startActivityForResult(i, MedicationActivity_ID);
		}
		
		
	}

}
