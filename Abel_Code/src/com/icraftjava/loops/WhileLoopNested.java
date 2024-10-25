package com.icraftjava.loops;

public class WhileLoopNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		while(i<=4) {
			System.out.println("Hi "+i);
			int j  = 1;
			while(j<=3) {
				System.out.println("Hello "+j);
				j++;
			}
			i++;
		}

		System.out.println("Bye "+i);

	}

}
