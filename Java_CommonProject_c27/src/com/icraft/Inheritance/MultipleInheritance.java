package com.icraft.Inheritance;

class Parent1{
	
	void show() {
		System.out.println("From parent 1");
	}
	
}

class Parent2{
	
	void show() {
		System.out.println("From parent 2");
	}
	
}

public class MultipleInheritance extends Parent1{

	public static void main(String[] args) {
		
		MultipleInheritance m1 = new MultipleInheritance();
		m1.show();

	}

}
