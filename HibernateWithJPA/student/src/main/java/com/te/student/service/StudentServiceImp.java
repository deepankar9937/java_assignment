package com.te.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.student.bean.StudentDetails;
import com.te.student.dao.StudentDao;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentDao dao;

	@Override
	public StudentDetails login(int rollno, String password) {
		if (rollno <= 0) {
			return null;
		} else {
			return dao.login(rollno, password);
		}
	}

}
