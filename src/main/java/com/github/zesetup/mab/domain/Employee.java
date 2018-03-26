package com.github.zesetup.mab.domain;

import java.util.UUID;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {		
	public void setSurname(String surname) {
		this.surname = surname;
	}
	private String employeeId;	

	private String login;

	private String name;

	private String surname;

	private String position; 

	
	private Boolean isActive = true;

	private String notes;
	

	public Employee(){
		this.employeeId = UUID.randomUUID().toString();
	}

	public Employee(String login, String name, String surname, String position){
		this.login = login;
		this.name = name;
		this.surname = surname;
		this.position = position;
		this.employeeId = UUID.randomUUID().toString();
	}
	
	
	public String getId() {
		return employeeId;
	}

	public String getLogin() {
		return login+"";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String  toString() {
		return "login: "+login+"; name: " +name+"; surname: "+surname+"; notes: "+notes;
	}
}
