package com.icraft.loopstmts;

public class BranchingExampleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write a code that will print like this:
		//* 
		//* *
		//* * *
		//* * * *
		//* * * * *

		
		for(int i=1; i<=5; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print("*" + " ");
			}
			
			System.out.println();
		}
		
	}

}
