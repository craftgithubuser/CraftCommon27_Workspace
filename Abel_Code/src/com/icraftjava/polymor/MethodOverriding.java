package com.icraftjava.polymor;

class A{
	void show() {
		System.out.println("Test 1");
	}
}

class B extends A{
	void show() {
		System.out.println("Test 2");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.show();
	}

}
