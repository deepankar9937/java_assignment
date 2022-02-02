package com.te.student.service;

import java.util.List;

import com.te.student.bean.StudentDetails;

public interface StudentService {
	
	public StudentDetails login(int id, String password);
	
	public boolean addStudent(StudentDetails details);
	
	public boolean deleteStudent(int id);
	
	public StudentDetails getData(int id);
	
	public List<StudentDetails> allEmpData();
	
	public boolean updateData(StudentDetails details,int id);

}
