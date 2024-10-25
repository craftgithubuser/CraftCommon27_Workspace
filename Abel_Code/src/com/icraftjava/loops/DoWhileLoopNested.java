package com.icraftjava.loops;

public class DoWhileLoopNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		
		do{
			System.out.println("Hi "+i);
			
			//Do While Nested loop
			int j = 1;
			do {
				System.out.println("Hello "+j);
				j++;
			}while(j<=3);
			
			i++;
		}while(i<=4);

		System.out.println("Bye "+i);
	}

}
