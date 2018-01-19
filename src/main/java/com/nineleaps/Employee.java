package com.nineleaps;

public class Employee {

	private String name;
	private String designation;
	private String manager;

	public Employee() {

	}

	public Employee(String name, String designation, String manager) {
		super();
		this.name = name;
		this.designation = designation;
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", manager=" + manager + "]";
	}

}
