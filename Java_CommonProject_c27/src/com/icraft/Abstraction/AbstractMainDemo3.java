package com.icraft.Abstraction;

public class AbstractMainDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotorBike m1 = new SportsBike();
		m1.brake();
		
		MotorBike m2 = new MountainBike();
		m2.brake();
	}

}
