package com.example.medicinereminder;

public class Database {

	private static Database singletonInstance = null;
	protected String firstName = ""; 
	protected String lastName = "";
	protected int avatarnumber = 0;
	
	private Database(){
		
	}
	
	public static Database getInstance(){
		if (singletonInstance == null)
			singletonInstance = new Database();
		return singletonInstance;
	}
	

}
