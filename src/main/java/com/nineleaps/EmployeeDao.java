package com.nineleaps;

public interface EmployeeDao {

	
	public Employee getEmployeeDetails(String name);
	
	public void addEmployee(Employee emp);
	
	public void updateEmployee(Employee emp);
}
