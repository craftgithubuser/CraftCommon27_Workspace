package com.icraft.Abstraction.Interface;

public class Rectangle implements Polygon {

	@Override
	public void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		 System.out.println("The area of the rectangle is " + (length * breadth));
	}

}
