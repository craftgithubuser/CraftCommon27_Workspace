package package1;

import java.util.Scanner;

public class employeInfo2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = in.next();
		
		System.out.println("Please enter your last name: ");
		String lastName = in.next();
		
		System.out.println("How old are you? ");
		int age = in.nextInt();
		
		System.out.println("Enter your salary: ");
		double salary = in.nextDouble();
		
		System.out.println("How much tip did you make? ");
		double tip = in.nextDouble();
				
		System.out.println("Enter your sex: ");
		char gender = in.next() .charAt(0);
		
		double totalSalary = tip + salary;
		
		System.out.println("First Name - " + firstName);
		System.out.println("Last Name - " +lastName);
		System.out.println("Age - " +age);
		System.out.println("Salary - "+salary);
		System.out.println("Tip - " +tip);
		System.out.println("Gender - " +gender);
		System.out.println("Total Salary = " +totalSalary);

	}

}
