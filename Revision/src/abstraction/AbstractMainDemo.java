package abstraction;

abstract class Language {

	public void display() {
		System.out.println("This is Java program");
	}

}

 class Java extends Language{
	 	 
 }

public class AbstractMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Language L1 = new Java ();
		
		L1.display();

	}

}
