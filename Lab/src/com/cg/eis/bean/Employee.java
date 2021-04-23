package com.cg.eis.bean;

public class Employee {
		private int id;
		private String name;
		private int sal;
		private String designation;
		private String scheme;

public Employee(int id,String name, int sal, String designation, String scheme) {
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.designation = designation;
	this.scheme = scheme;	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getScheme() {
	return scheme;
}
public void setScheme(String scheme) {
	this.scheme = scheme;
}
public void disp() {
	System.out.println("ID : "+id+" Name : "+name+" Salary : "+sal+"Designation : "+designation+" Scheme : "+scheme);
}
}