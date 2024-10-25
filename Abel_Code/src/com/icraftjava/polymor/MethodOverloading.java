package com.icraftjava.polymor;
class Calc{
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	void add(int a,double b,int c) {
		System.out.println(a+b+c);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c1 = new Calc();
		
		c1.add(5,8.6);
	}

}
