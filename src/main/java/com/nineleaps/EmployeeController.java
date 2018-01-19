package com.nineleaps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployeeDetails(String name) throws Exception {
		return ResponseEntity.ok(employeeDao.getEmployeeDetails(name));
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<?> createEmployeeDetails(@RequestBody Employee emp) throws Exception {
		employeeDao.addEmployee(emp);
		return ResponseEntity.accepted().build();
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<?> updateEmployeeDetails(Employee emp) throws Exception {
		employeeDao.updateEmployee(emp);
		return ResponseEntity.accepted().build();
	}

}
