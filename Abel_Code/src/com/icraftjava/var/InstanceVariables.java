package com.icraftjava.var;

import java.io.IOException;

public class InstanceVariables {
	
	int height,weight; // Instance Variables
	InstanceVariables(int h, int w) {
	    this.height = h;
	    this.weight = w;
	  }
	 
	  void run() {
	    System.out.println("Huff Puff");
	  }
	  
	  void print() {
	    System.out.println("Now my weight is " + this.weight);
	  }
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InstanceVariables A = new InstanceVariables(170, 65);
	    A.run();
	    A.print();
	}

}
