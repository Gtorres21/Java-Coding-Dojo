package com.caresoft.clinicapp.models;

import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.interfaces.HIPAACompliantAdmin;
import com.caresoft.clinicapp.interfaces.HIPAACompliantUser;
//need to extend User
// DONE: Implement HIPAACompliantAdmin!
// DONE: Implement HIPAACompliantUser!
public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser{
//... imports class definition...
	
	// Inside class:
	private Integer employeeID;
	private String role;
	private ArrayList<String> securityIncidents = new ArrayList<String>();
	

	public AdminUser() {}
    // TO DO: Implement a constructor that takes an ID and a role
	public AdminUser(Integer id ,String role) {
		this.employeeID = id;
		this.role = role;
	}
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    
	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if(length >= 6) {
			return true;
		}else {
			return false;	
		}
	}
		

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID == this.employeeID ) {
			return true;
		}else {
		authIncident();
		return false;
		}
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
//		  for (int i = 0; i < this.securityIncidents.size(); i++) {
//			  
//		  }
		return securityIncidents;
			  
	}

	
	
	
	
	// DONE: Setters & Getters
    public ArrayList<String> getSecurityIncidents() {
    	return securityIncidents;
    }
    
    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
    	this.securityIncidents = securityIncidents;
    }
	
	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
}
