package com.te.employee.dao;

import java.util.List;

import com.te.employee.bean.EmployeeDetails;

public interface EmployeeDb {
	public EmployeeDetails login(int id, String password);

	public boolean addEmp(EmployeeDetails details);

	public boolean deleteData(int id);

	public EmployeeDetails getData(int id);

	public List<EmployeeDetails> allEmpData();

	public boolean updateData(EmployeeDetails details,int id);
}
