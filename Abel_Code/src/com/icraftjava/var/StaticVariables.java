package com.icraftjava.var;

import java.io.IOException;

public class StaticVariables {
	
	static int studentCount; // static variables 
	StaticVariables() {
	    studentCount = 15;
	  }
	  void addStudent() {
	    studentCount++;
	  }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StaticVariables java = new StaticVariables();
		StaticVariables python = new StaticVariables();
	    java.addStudent();
	    python.addStudent();
	    System.out.println("Total Students " + studentCount);
	}

}
