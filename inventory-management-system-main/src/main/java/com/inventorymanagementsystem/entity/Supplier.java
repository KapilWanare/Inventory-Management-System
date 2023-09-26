package com.inventorymanagementsystem.entity;

public class Supplier {
	 public  String  name;
	    public Supplier(String name, int password) {
		super();
		this.name = name;
		this.password = password;
	}
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
		public int password;
 public Supplier()
{
	 
}
}
