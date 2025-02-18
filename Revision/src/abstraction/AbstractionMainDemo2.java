package abstraction;

abstract class Animal{
	
	abstract void makeSound();
	
	
	public void eat() {
		
		System.out.println("I can Eat");
	}
	
}

class Dog extends Animal{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bark Bark");
	}
	
}


public class AbstractionMainDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal D1 = new Dog ();
		D1.makeSound();
		D1.eat();
		

	}

}
