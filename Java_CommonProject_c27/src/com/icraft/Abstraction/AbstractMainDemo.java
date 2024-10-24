package com.icraft.Abstraction;

abstract class Language{ //abstract class
	
	  // method of abstract class
	  // Regular method
	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	
}
class Java extends Language {
	
}

public class AbstractMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Language l1 = new Java();
		l1.display();
		
	}

}
