package com.ericbarajas.test;

import com.ericbarajas.interfaces.HIPAACompliantAdmin;
import com.ericbarajas.interfaces.HIPAACompliantUser;
import java.util.ArrayList;
import java.util.Date;


public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
		super(id);
		this.employeeID = id;
		this.securityIncidents = new ArrayList<String>();
		this.role = role;
		
	}
    
 // TO DO: Implement HIPAACompliantAdmin!
    @Override
//  Returns a list of strings (incidents reported)
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
    	return getSecurityIncidents();
	}
    
//  TO DO: Implement HIPAACompliantUser!
	@Override
//	Pin must be 6 digits or more; returns false if not
//	Expected to assign the pin to the user (as a member variable)
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		String pinString = Integer.toString(pin);
		if (pinString.length() < 5) {
			return false;
		}
		this.pin = pin;
		return true;
	}
	
	@Override
//	Compares the ID's, and if they are not a match,
//	creates an incident report using the authIncident method,
//	Returns true if ID's match, false if not.
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (this.id == confirmedAuthID) {
			return true;
		}
		else {
			authIncident();
			return false;
		}
	}
    
	
//	
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
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	
    // TO DO: Setters & Getters
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

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
}
