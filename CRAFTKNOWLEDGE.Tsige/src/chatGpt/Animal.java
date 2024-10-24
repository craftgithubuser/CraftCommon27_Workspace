package chatGpt;

public class Animal {
	
	public void sound(){
		
		System.out.println("Animals make sound");
	}
     
	class Dog extends Animal{
		public void sound() {
			System.out.println("Dogs bark");
		}
	}
	  public static void main(String[] args) {
		  Animal A1=new Animal();
		  A1.sound();
	  }
	
}
