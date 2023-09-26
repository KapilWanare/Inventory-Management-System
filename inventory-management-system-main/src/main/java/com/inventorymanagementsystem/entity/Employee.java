package com.inventorymanagementsystem.entity;

public class Employee {
    public  String  name;
    public int password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public Employee(String name, int password) {
	
		this.name = name;
		this.password = password;
	}
	public Employee()
	{
		
	}
	
}