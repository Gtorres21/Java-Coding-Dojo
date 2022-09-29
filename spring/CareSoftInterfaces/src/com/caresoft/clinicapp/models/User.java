package com.caresoft.clinicapp.models;

public class User {
    protected Integer id;
    protected int pin;
    
//    Constructor
    // Implement a constructor that takes an ID
    public User() {}
    
    public User(Integer id) {
    	this.id = id;	
    }

    
    
//    Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
    
    
    
    
}