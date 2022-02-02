package com.te.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.student.bean.StudentDetails;

@Repository
public class StudentDaoImp implements StudentDao {

	@Override
	public StudentDetails login(int id, String password) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();

		StudentDetails details = manager.find(StudentDetails.class, id);
		if (details != null) {
			if (details.getPassword().equals(password)) {
				return details;
			}
		}
		System.out.println(details);
		return null;
	}

	@Override
	public boolean addStudent(StudentDetails details) {
		boolean isAdded = false;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(details);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return isAdded;
	}

	@Override
	public boolean deleteStudent(int id) {
		boolean isDeleted = false;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			StudentDetails details = manager.find(StudentDetails.class, id);
			transaction.begin();
			manager.remove(details);
			transaction.commit();
			isDeleted = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return isDeleted;
	}

	@Override
	public StudentDetails getData(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		StudentDetails details = manager.find(StudentDetails.class, id);
		if (details != null) {
			return details;
		} else {
			return null;
		}

	}

	@Override
	public List<StudentDetails> allEmpData() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("From StudentDetails");

		List<StudentDetails> list = query.getResultList();

		return list;
	}

	@Override
	public boolean updateData(StudentDetails details, int id) {
		boolean isUpdated = false;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();
			StudentDetails details2 = manager.find(StudentDetails.class, id);
			if (details2 != null) {
				details2.setName(details.getName());
				details2.setMark(details.getMark());
				details2.setAddress(details.getAddress());
				details2.setPassword(details.getPassword());
			}

			manager.persist(details2);
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return isUpdated;
	}

}
