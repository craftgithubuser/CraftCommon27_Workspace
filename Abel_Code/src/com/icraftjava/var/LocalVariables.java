package com.icraftjava.var;

import java.io.IOException;

public class LocalVariables {

	public double calcSalary() {
		int initial = 1500; //local variables
		double salary = initial + initial*30/100; //local variables
		return salary;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		LocalVariables p1 = new LocalVariables();

		System.out.println("Salary: " +p1.calcSalary());

	}

}
