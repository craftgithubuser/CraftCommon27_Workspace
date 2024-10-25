package chatGpt;

import practice1.Encapsulation.Person;

public class SecondTry {
	public class Encapsulation {
		// Class with encapsulation
		public class Person {

		    // Private fields (variables) - data is hidden from outside
		    private String name;
		    private int age;

		    // Constructor to initialize the person object
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
		        if (age > 0) {  // Validation for age
		            this.age = age;
		        } else {
		            System.out.println("Please enter a valid age.");
		        }
		    }

		    // Display person details
		    public void displayPersonInfo() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }
		}

		// Main class to test the encapsulation
		public class Main {
		    public static void main(String[] args) {
		        // Create a person object
		        Person person = new Person("John", 25);

		        // Accessing private fields via public methods (getters and setters)
		        System.out.println("Person's Name: " + person.getName());
		        System.out.println("Person's Age: " + person.getAge());

		        // Modify values using setters
		        person.setName("Doe");
		        person.setAge(30);

		        // Display updated person details
		        person.displayPersonInfo();
		    }
		}


	}


}
