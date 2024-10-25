package com.icraftjava.Oper;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		a = 20;
		b = 2;
		
		c = a + b;
		System.out.println("Addition: "+c);
		
		c = a - b;
		System.out.println("Substraction: "+c);

		c = a * b;
		System.out.println("Multiplication: "+c);

		c = a / b;
		System.out.println("Division: "+c);

		b = 3;
		c = a%b;
		System.out.println("Remainder: "+c);
		
		a = ++a; //Increments the value before using it.
		System.out.println("Prefix Increment: "+a);

		a = a++; //Uses the current value and then increments.
		System.out.println("Postfix increment: "+a);
		
		a = --a; //Decrements the value before using it.
		System.out.println("Prefix decrement: "+a);

		a = a--; //Uses the current value and then decrements.
		System.out.println("Postfix decrement: "+a);

	}

}
