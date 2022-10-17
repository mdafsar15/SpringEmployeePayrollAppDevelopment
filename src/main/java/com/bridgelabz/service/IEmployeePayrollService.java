package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.dto.EmployeePayrollDTO;
import com.bridgelabz.model.EmployeeData;

public interface IEmployeePayrollService {

	List<EmployeeData> getEmployeePayrollData();

	EmployeeData getEmployeePayrollDataById(int empId);

	EmployeeData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
	
	EmployeeData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	void deleteEmployeePayrollData(int empId);

}
