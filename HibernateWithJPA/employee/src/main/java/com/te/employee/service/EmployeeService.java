package com.te.employee.service;


import java.util.List;

import com.te.employee.bean.EmployeeDetails;


public interface EmployeeService {
	
	public EmployeeDetails login(int id, String password);
	
	public Boolean addEmp(EmployeeDetails details);
	
	public boolean deleteData(int id);
	
	public EmployeeDetails getData(int id);
	
	public boolean updateData(EmployeeDetails details,int id);
	
	public List<EmployeeDetails> allEmpData();
}
