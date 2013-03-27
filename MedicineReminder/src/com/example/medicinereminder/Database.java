package com.example.medicinereminder;

public class Database {

	private static Database singletonInstance = null;
	protected String firstName = ""; 
	protected String lastName = "";
	protected String dateOfDiagnosis = "";
	protected String viralLoad = "";
	protected String phone = "";
	protected String providerPhone = "";
	protected String medication1 = "";
	protected String medication2 = "";
	protected String medication3 = "";
	protected Time time1 = null;
	protected Time time2 = null;
	
	private Database(){
		
	}
	
	public static Database getInstance(){
		if (singletonInstance == null)
			singletonInstance = new Database();
		return singletonInstance;
	}
	

}
