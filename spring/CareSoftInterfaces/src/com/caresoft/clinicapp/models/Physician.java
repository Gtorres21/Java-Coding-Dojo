package com.caresoft.clinicapp.models;

import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.interfaces.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser {
	// DONE: Implement HIPAACompliantUser!
	// Inside class:    
	private ArrayList<String> patientNotes;

	public Physician() {}
		
	// DONE: Constructor that takes an ID
	public Physician(Integer id) {
		super(id);
	}
	//... imports class definition...
	
	
	    
		
		
	    public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }
	    
	    
		@Override
		public boolean assignPin(int pin) {
			int length = String.valueOf(pin).length();
			if(length == 4) {
				return true;
			}else {
				return false;
			}
		}

		@Override
		public boolean accessAuthorized(Integer confirmedAuthID) {
			if(confirmedAuthID == this.id) {
				return true;
			}else {
				return false;
			}
		}



	    // DONE: Setters & Getters
		public ArrayList<String> getPatientNotes() {
			return patientNotes;
		}
		
		public void setPatientNotes(ArrayList<String> patientNotes) {
			this.patientNotes = patientNotes;
		}
		
		
		
	}


