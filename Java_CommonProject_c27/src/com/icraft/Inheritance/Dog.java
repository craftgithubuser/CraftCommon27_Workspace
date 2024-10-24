package com.icraft.Inheritance;

//Animal  - a parent class
//Dog -- a child

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog can eat");
	}
	
	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
		
		eat();
		super.eat();
	}

}
