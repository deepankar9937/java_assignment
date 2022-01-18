package com.te.comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	int id,age;
	String name;
	double salary;
	public Employee(int id, int age, String name, double salary) {
		
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", Course_fee=" + salary + "]";
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id;
	}
	
	
	
}
