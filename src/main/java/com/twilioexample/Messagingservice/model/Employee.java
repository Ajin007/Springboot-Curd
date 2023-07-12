package com.twilioexample.Messagingservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author AjinRoch
 * 
 */

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	@Column(name="emp_id")
	public Long Identity;
	
	@Column(name="first_name")
	public String Firstname;
	
	@Column(name="last_name")
	public String Lastname;
	
	@Column(name="email_id")
	public String Email;

	public Long getIdentity() {
		return Identity;
	}

	public void setIdentity(Long identity) {
		Identity = identity;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	

}
