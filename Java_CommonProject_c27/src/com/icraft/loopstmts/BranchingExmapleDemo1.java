package com.icraft.loopstmts;

public class BranchingExmapleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//write a code that will print like this:
		//1 
		//1 2
		//1 2 3 
		//1 2 3 4
		//1 2 3 4 5
		
		for(int i=1; i<=5; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print(k + " ");
			}
			
			System.out.println();
		}
	   
	}

}
