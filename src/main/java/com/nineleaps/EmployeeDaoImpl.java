package com.nineleaps;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	
	JdbcWrapper wrapper=null;
	public EmployeeDaoImpl(){
		wrapper= new JdbcWrapper();
	}

	public Employee getEmployeeDetails(String name) {
	 return wrapper.getEmployeeByName(name);
	}

	public void addEmployee(Employee emp) {
		wrapper.insertIntoDb(emp.getName(), emp.getDesignation(), emp.getManager());
		
	}

	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
