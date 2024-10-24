package com.icraft.collection;

import java.util.*;
import java.util.Map.Entry;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<Employee>();

		Employee e1 = new Employee();
		e1.setEmpId(1000);
		e1.setEmpName("Daniel");
		e1.setEmpSalary(20000);
		list.add(e1);

		Employee e2 = new Employee();
		e2.setEmpId(2000);
		e2.setEmpName("Abdu");
		e2.setEmpSalary(25000);
		list.add(e2);

		Employee e3 = new Employee();
		e3.setEmpId(3000);
		e3.setEmpName("Mary");
		e3.setEmpSalary(35000);
		list.add(e3);
		
		System.out.println("Using Iterator \n");
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			Employee me = (Employee) i.next();
			
			System.out.println("Employee ID: " + me.getEmpId());
			System.out.println("Employee Name: " + me.getEmpName());
			System.out.println("Employee ID: " + me.getEmpSalary());
			System.out.println();
		}
		
		System.out.println("Using For each \n");

		for(Employee emp:list) {
			System.out.println("Employee ID: " + emp.getEmpId());
			System.out.println("Employee Name: " + emp.getEmpName());
			System.out.println("Employee ID: " + emp.getEmpSalary());
			System.out.println();
		}

	}

}
