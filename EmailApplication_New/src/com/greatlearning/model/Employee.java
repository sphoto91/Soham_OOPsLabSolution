package com.greatlearning.model;
import java.util.*;
public class Employee{
	private String firstname, lastname;
	
	public Employee(String firstname, String lastname){
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		}
	
public String getfirstname() {
	return firstname;
}
public void setfirstname(String firstname) {
	this.firstname = firstname;
}
public String getlastname() {
	return lastname;
}
public void setlastname(String lastname) {
	this.firstname = lastname;
}
public int hascode() {
	return Objects.hash(firstname, lastname);
}
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname);
}

}
