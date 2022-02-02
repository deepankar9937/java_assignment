package com.te.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.student.bean.StudentDetails;
import com.te.student.dao.StudentDao;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDao dao;

	@Override
	public StudentDetails login(int id, String password) {
		if (id <= 0) {
			return null;

		} else {
			return dao.login(id, password);

		}

	}

	@Override
	public boolean addStudent(StudentDetails details) {
		return dao.addStudent(details);
	}

	@Override
	public boolean deleteStudent(int id) {
		if (id <= 0) {
			return false;

		} else {
			return dao.deleteStudent(id);

		}
	}

	@Override
	public StudentDetails getData(int id) {
		if (id <= 0) {
			return null;

		} else {
			return dao.getData(id);

		}
	}

	@Override
	public List<StudentDetails> allEmpData() {
		// TODO Auto-generated method stub
		return dao.allEmpData();
	}

	@Override
	public boolean updateData(StudentDetails details, int id) {
		// TODO Auto-generated method stub
		return dao.updateData(details,id);
	}

}
