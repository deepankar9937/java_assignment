package com.te.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(10, 10, "Deepankar", 4200.56));
		arrayList.add(new Employee(30, 14, "Sankar", 9880.56));
		arrayList.add(new Employee(50, 12, "Bhupati", 5400.56));
		arrayList.add(new Employee(20, 13, "Anil", 3200.56));
		arrayList.add(new Employee(40, 15, "Anil2", 4000.56));
		
		System.out.println(arrayList);
		System.out.println("Enter what are you trying to sort ");
		System.out.println("For id sorting press 1");
		System.out.println("For age sorting press 2");
		System.out.println("For name sorting press 3");
		System.out.println("for salary sorting press 4");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		switch (input) {
			case 1: {
				Collections.sort(arrayList, new Employee());
				for (Employee employee : arrayList) {
					System.out.println(employee);
				}
			}
			break;
			case 2:{
				Collections.sort(arrayList, new SortByAge());
				for (Employee employee : arrayList) {
					System.out.println(employee);
				}
			}
			break;
			case 3 :{
				Collections.sort(arrayList, new SortByName());
				for (Employee employee : arrayList) {
					System.out.println(employee);
				}
			}
			break;
			case 4:{
				Collections.sort(arrayList,new SortBySalary());
				for (Employee employee : arrayList) {
					System.out.println(employee);
				}
			}
			break;			
		}
	}
}
