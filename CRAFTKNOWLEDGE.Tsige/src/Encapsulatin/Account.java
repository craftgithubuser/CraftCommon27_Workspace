package Encapsulatin;

public class Account {
	// Encapsulation example in Java
	class Person {
	    // Private variables (cannot be accessed directly outside the class)
	    private String name;
	    private int age;

	    // Public constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Setter method for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }

	    // Setter method for age
	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age must be positive.");
	        }
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Creating an object of Person
	        Person person = new Person("Alice", 30);

	        // Accessing the data via getter methods
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());

	        // Modifying the data using setter methods
	        person.setName("Bob");
	        person.setAge(25);

	        System.out.println("Updated Name: " + person.getName());
	        System.out.println("Updated Age: " + person.getAge());

	        // Trying to set a negative age (invalid value)
	        person.setAge(-5);  // Will print a validation message
	    }
	}


}
