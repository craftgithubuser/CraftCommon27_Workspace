package com.icraft.loopstmts;

public class JavaLoopsExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a code that will print the blow output
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		for(int j=1; j<=4; j++) { //out loop
		
		for(int i=1; i<=5; i++) { //inner loop
			System.out.print(i + " ");
		}
		
		System.out.println();
		}
		

	}

}
