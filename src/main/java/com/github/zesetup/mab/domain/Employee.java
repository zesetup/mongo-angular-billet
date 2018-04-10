package com.github.zesetup.mab.domain;

import java.util.UUID;
import javax.xml.bind.annotation.XmlRootElement;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

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
	
	public Employee(String login, String name, String surname, String position, String eid){
      this.login = login;
      this.name = name;
      this.surname = surname;
      this.position = position;
      this.employeeId = eid;
  }
	
	
	public String getId() {
		return employeeId;
	}

	public String getLogin() {
		return login;
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

	@Override
	public String  toString() {
      return "login: " + login + "; name: " + name + "; surname: " + surname; 
	}

  public static Employee fromDbObject(DBObject dbObject) {
    return new Employee(
        (String) dbObject.get("eid"),
        (String) dbObject.get("login"),
        (String) dbObject.get("name"),
        (String) dbObject.get("surname"),
        (String) dbObject.get("position")
        );
  }

  public  DBObject toDbObject() {
    DBObject  dbObject =  new BasicDBObject();
    dbObject.put("eid", this.employeeId);
    dbObject.put("login", this.login);
    dbObject.put("name", this.name);
    dbObject.put("surname", this.surname);
    dbObject.put("position", this.position);
    return dbObject;
  }
}
